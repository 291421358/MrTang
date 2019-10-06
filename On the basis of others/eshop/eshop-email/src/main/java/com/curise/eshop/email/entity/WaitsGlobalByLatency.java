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
public class WaitsGlobalByLatency implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("events")
    private String events;

    @TableField("total")
    private Long total;

    @TableField("total_latency")
    private String totalLatency;

    @TableField("avg_latency")
    private String avgLatency;

    @TableField("max_latency")
    private String maxLatency;


}
