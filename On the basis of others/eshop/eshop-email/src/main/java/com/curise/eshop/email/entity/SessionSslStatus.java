package com.curise.eshop.email.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * VIEW
 * </p>
 *
 * @author TZHH
 * @since 2019-10-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SessionSslStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("thread_id")
    private Long threadId;

    @TableField("ssl_version")
    private String sslVersion;

    @TableField("ssl_cipher")
    private String sslCipher;

    @TableField("ssl_sessions_reused")
    private String sslSessionsReused;


}
