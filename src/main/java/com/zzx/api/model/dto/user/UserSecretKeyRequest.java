package com.zzx.api.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户创建请求
 *
 * @author <a>zzx</a>
 *  
 */
@Data
public class UserSecretKeyRequest implements Serializable {


    /**
     * 许可证
     */
    private String accessKey;

    /**
     *
     */
    private String paramJSON;



    private static final long serialVersionUID = 1L;
}