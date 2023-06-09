package com.zzx.api.model.dto.interfaceInfo;

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
public class InterfaceInfoQueryRequest extends PageRequest implements Serializable {

    /**
     * id
     */

    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 描述
     */
    private String description;

    /**
     * 请求头
     */
    private String requestHeader;

    /**
     * 响应头
     */
    private String responseHeader;

    /**
     * 接口地址
     */
    private String url;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 创建用户 id
     */
    private Long userId;

    /**
     * 状态 0 关闭 1 开启
     */
    private Integer status;



    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}