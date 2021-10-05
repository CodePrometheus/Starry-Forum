package com.star.forum.service;

import com.star.forum.mapper.AdMapper;
import com.star.forum.model.Ad;
import com.star.forum.model.AdExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: zzStar
 * @Date: 01-10-2021 01:43
 */
@Service
public class AdService {

    @Resource
    private AdMapper adMapper;

    public List<Ad> list(String pos) {
        AdExample adExample = new AdExample();
        adExample.createCriteria()
                .andStatusEqualTo(1)
                .andPosEqualTo(pos)
                .andGmtStartLessThan(System.currentTimeMillis())
                .andGmtEndGreaterThan(System.currentTimeMillis());
        return adMapper.selectByExample(adExample);
    }

}

