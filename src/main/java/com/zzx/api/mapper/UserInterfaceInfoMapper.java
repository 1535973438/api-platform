package com.zzx.api.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzx.common.model.entity.UserInterfaceInfo;


import java.util.List;

/**
 * @Entity com.yupi.project.model.entity.UserInterfaceInfo
 */
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




