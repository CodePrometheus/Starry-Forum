package com.star.forum.mapper;

import com.star.forum.dto.UserQueryDTO;
import com.star.forum.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserExtMapper {
    List<User> selectLatestLoginUser(UserQueryDTO userQueryDTO);

    Integer count(UserQueryDTO userQueryDTO);
}
