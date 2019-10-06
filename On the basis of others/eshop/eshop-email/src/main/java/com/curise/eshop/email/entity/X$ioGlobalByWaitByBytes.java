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
public class X$ioGlobalByWaitByBytes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("event_name")
    private String eventName;

    @TableField("total")
    private Long total;

    @TableField("total_latency")
    private Long totalLatency;

    @TableField("min_latency")
    private Long minLatency;

    @TableField("avg_latency")
    private Long avgLatency;

    @TableField("max_latency")
    private Long maxLatency;

    @TableField("count_read")
    private Long countRead;

    @TableField("total_read")
    private Long totalRead;

    @TableField("avg_read")
    private BigDecimal avgRead;

    @TableField("count_write")
    private Long countWrite;

    @TableField("total_written")
    private Long totalWritten;

    @TableField("avg_written")
    private BigDecimal avgWritten;

    @TableField("total_requested")
    private Long totalRequested;


}
