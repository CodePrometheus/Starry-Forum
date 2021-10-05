package com.star.forum.service;


import com.star.forum.mapper.UserAccountMapper;
import com.star.forum.model.UserAccount;
import com.star.forum.model.UserAccountExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户账户信息处理
 *
 * @Author: zzStar
 * @Date: 12-03-2020 22:36
 */
@Service
public class UserAccountService {

    @Resource
    private UserAccountMapper userAccountMapper;

    public UserAccount selectUserAccountByUserId(Long userId) {
        UserAccountExample userAccountExample = new UserAccountExample();
        userAccountExample.createCriteria().andUserIdEqualTo(userId);
        List<UserAccount> userAccounts = userAccountMapper.selectByExample(userAccountExample);
        UserAccount userAccount = userAccounts.get(0);
        return userAccount;
    }

    public boolean isAdminByUserId(Long userId) {
        if (selectUserAccountByUserId(userId).getGroupId() >= 18) return true;
        else return false;
    }

}

