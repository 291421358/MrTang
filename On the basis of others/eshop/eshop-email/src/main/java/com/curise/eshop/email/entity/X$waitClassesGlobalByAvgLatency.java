package com.curise.eshop.email.entity;

import java.math.BigDecimal;
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
public class X$waitClassesGlobalByAvgLatency implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("event_class")
    private String eventClass;

    @TableField("total")
    private BigDecimal total;

    @TableField("total_latency")
    private BigDecimal totalLatency;

    @TableField("min_latency")
    private Long minLatency;

    @TableField("avg_latency")
    private BigDecimal avgLatency;

    @TableField("max_latency")
    private Long maxLatency;


}
