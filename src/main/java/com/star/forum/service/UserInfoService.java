package com.star.forum.service;


import com.star.forum.mapper.UserInfoMapper;
import com.star.forum.model.UserInfo;
import com.star.forum.model.UserInfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户信息处理
 *
 * @Author: zzStar
 * @Date: 12-03-2020 22:45
 */
@Service
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    private final int[] dayArr = new int[]{20, 19, 21, 20, 21, 22, 23, 23, 23, 24, 23, 22};
    private final String[] constellationArr = new String[]{"摩羯座", "水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座", "天蝎座", "射手座", "摩羯座"};

    public int updateByUserId(UserInfo userInfo, Long userId) {
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUserIdEqualTo(userId);
        return userInfoMapper.updateByExampleSelective(userInfo, userInfoExample);
    }

    public UserInfo selectByUserId(Long userId) {
        //  Long id = Long.parseLong(userId);
        UserInfoExample userInfoExample = new UserInfoExample();
        userInfoExample.createCriteria().andUserIdEqualTo(userId);
        List<UserInfo> userInfos = userInfoMapper.selectByExample(userInfoExample);
        UserInfo userInfo = userInfos.get(0);
        return userInfo;
    }

    public String getConstellation(int month, int day) {
        return day < dayArr[month - 1] ? constellationArr[month - 1] : constellationArr[month];
    }
}
