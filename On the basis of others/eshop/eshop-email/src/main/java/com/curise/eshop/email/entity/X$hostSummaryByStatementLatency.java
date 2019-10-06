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
public class X$hostSummaryByStatementLatency implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("host")
    private String host;

    @TableField("total")
    private BigDecimal total;

    @TableField("total_latency")
    private BigDecimal totalLatency;

    @TableField("max_latency")
    private Long maxLatency;

    @TableField("lock_latency")
    private BigDecimal lockLatency;

    @TableField("rows_sent")
    private BigDecimal rowsSent;

    @TableField("rows_examined")
    private BigDecimal rowsExamined;

    @TableField("rows_affected")
    private BigDecimal rowsAffected;

    @TableField("full_scans")
    private BigDecimal fullScans;


}
