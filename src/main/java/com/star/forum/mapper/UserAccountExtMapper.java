package com.star.forum.mapper;


import com.star.forum.model.UserAccount;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAccountExtMapper {

    int incScore(UserAccount userAccount);

    int decScore(UserAccount userAccount);
}
