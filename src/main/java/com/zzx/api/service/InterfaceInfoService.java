package com.zzx.api.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zzx.api.model.dto.interfaceInfo.InterfaceInfoQueryRequest;
import com.zzx.common.model.entity.InterfaceInfo;
import com.zzx.common.model.vo.InterfaceInfoVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author zzx
* @description 针对表【interfaceinfo(接口信息)】的数据库操作Service
* @createDate 2023-03-06 20:39:25
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {

    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);

    InterfaceInfoVO getInterfaceInfoVO(InterfaceInfo interfaceInfo, HttpServletRequest request);

    QueryWrapper<InterfaceInfo> getQueryWrapper(InterfaceInfoQueryRequest interfaceInfoQueryRequest);
}
