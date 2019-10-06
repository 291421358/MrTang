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
public class X$waitsByHostByLatency implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("host")
    private String host;

    @TableField("event")
    private String event;

    @TableField("total")
    private Long total;

    @TableField("total_latency")
    private Long totalLatency;

    @TableField("avg_latency")
    private Long avgLatency;

    @TableField("max_latency")
    private Long maxLatency;


}
