package com.zzx.api.model.dto.userinterfaceinfo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.zzx.api.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 查询请求
 *
 * @author <a>zzx</a>
 *  
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserInterfaceInfoQueryRequest extends PageRequest implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 调用用户 id
     */
    private Long userId;

    /**
     * 接口 id
     */
    private Long interfaceInfoId;



    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}