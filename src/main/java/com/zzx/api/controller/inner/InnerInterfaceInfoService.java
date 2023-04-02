package com.zzx.api.controller.inner;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zzx.api.common.ErrorCode;
import com.zzx.api.exception.BusinessException;
import com.zzx.api.mapper.InterfaceInfoMapper;
import com.zzx.common.model.entity.InterfaceInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
@RestController
public class InnerInterfaceInfoService  {
    @Resource
    private InterfaceInfoMapper interfaceInfoMapper;
    @PostMapping("/getinterfaceinfo")
    public InterfaceInfo getInterfaceInfo(String url, String method) {
        if (StringUtils.isAnyBlank(url, method)) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        QueryWrapper<InterfaceInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("url", url);
        queryWrapper.eq("method", method);
        return interfaceInfoMapper.selectOne(queryWrapper);
    }
}
