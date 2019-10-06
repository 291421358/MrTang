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
public class X$userSummaryByFileIoType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("user")
    private String user;

    @TableField("event_name")
    private String eventName;

    @TableField("total")
    private Long total;

    @TableField("latency")
    private Long latency;

    @TableField("max_latency")
    private Long maxLatency;


}
