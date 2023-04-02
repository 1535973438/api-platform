package com.zzx.api.model.dto.userinterfaceinfo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

/**
 * 更新请求
 *
 * @author <a>zzx</a>
 *  
 */
@Data
public class UserInterfaceInfoUpdateRequest implements Serializable {

    private Long id;

    /**
     * 总调用次数
     */
    private Integer totalNum;

    /**
     * 剩余调用次数
     */
    private Integer leftNum;

    /**
     * 0-正常，1-禁用
     */
    private Integer status;



    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}