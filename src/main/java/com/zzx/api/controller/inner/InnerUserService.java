package com.zzx.api.controller.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

import com.zzx.api.common.ErrorCode;
import com.zzx.api.exception.BusinessException;
import com.zzx.api.mapper.UserMapper;
import com.zzx.common.model.entity.User;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class InnerUserService {

    @Resource
    private UserMapper userMapper;

    @PostMapping("/getinvokeuser")
    public User getInvokeUser(String accessKey) {
        if (StringUtils.isAnyBlank(accessKey)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("accessKey", accessKey);
        return userMapper.selectOne(queryWrapper);
    }
}
