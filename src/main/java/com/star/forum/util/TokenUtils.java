package com.star.forum.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.star.forum.dto.ResultDTO;
import com.star.forum.dto.UserDTO;
import com.star.forum.exception.CustomizeErrorCode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Component("TokenUtils")
public class TokenUtils {

    private static String SECRET;

    @Value("${site.jwt.secret}")
    public void setSecret(String SECRET) {
        this.SECRET = SECRET;
    }

    public String getToken(UserDTO user) {
        String token = "";
        token = JWT.create()
                .withIssuer("StarryUser")
                //.withAudience(""+user.getId())// 将 user id 保存到 token 里面
                .withClaim("name", user.getName())
                .withClaim("id", user.getId())
                //.withClaim("userId",""+user.getId())
                .withClaim("avatarUrl", user.getAvatarUrl())
                .withClaim("groupId", user.getGroupId())
                .withClaim("vipRank", user.getVipRank())
                .withExpiresAt(new Date(System.currentTimeMillis() + 3600000 * 24 * 3))//三天
                .sign(Algorithm.HMAC256(SECRET));// 以 password 作为 token 的密钥
        return token;
    }

    public static ResultDTO verifyToken(String token) throws Exception {

        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256(SECRET)).withIssuer("StarryUser").build();
        try {
            DecodedJWT verify = jwtVerifier.verify(token);
            Map<String, Claim> map = verify.getClaims();
            //System.out.println("ClaimMap" + JSON.toJSONString(map));
            UserDTO userDTO = new UserDTO();
            userDTO.setId(map.get("id").asLong());
            userDTO.setName(map.get("name").asString());
            userDTO.setAvatarUrl(map.get("avatarUrl").asString());
            userDTO.setVipRank(map.get("vipRank").asInt());
            userDTO.setGroupId(map.get("groupId").asInt());
            Map<String, String> resultMap = new HashMap<>(map.size());
            map.forEach((k, v) -> resultMap.put(k, v.asString()));
            //System.out.println("resultMap" + JSON.toJSONString(resultMap));
            return ResultDTO.okOf(userDTO);

        } catch (JWTVerificationException e) {
            //System.err.println("token验证失败："+e.getMessage());
            return ResultDTO.errorOf(CustomizeErrorCode.NO_LOGIN);
        }


    }

}
