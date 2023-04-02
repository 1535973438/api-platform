package com.zzx.api.model.dto.interfaceInfo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 编辑请求
 *
 * @author <a>zzx</a>
 *  
 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {
    /**
     * id
     */

    private Long id;

    /**
     * 请求参数
     */
    private String userRequestParams;

    private static final long serialVersionUID = 1L;
}