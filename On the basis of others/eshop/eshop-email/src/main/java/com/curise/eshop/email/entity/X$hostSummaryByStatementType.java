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
public class X$hostSummaryByStatementType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("host")
    private String host;

    @TableField("statement")
    private String statement;

    @TableField("total")
    private Long total;

    @TableField("total_latency")
    private Long totalLatency;

    @TableField("max_latency")
    private Long maxLatency;

    @TableField("lock_latency")
    private Long lockLatency;

    @TableField("rows_sent")
    private Long rowsSent;

    @TableField("rows_examined")
    private Long rowsExamined;

    @TableField("rows_affected")
    private Long rowsAffected;

    @TableField("full_scans")
    private Long fullScans;


}
