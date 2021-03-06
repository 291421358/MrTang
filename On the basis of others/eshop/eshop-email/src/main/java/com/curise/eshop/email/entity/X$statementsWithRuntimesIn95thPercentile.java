package com.curise.eshop.email.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
public class X$statementsWithRuntimesIn95thPercentile implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("query")
    private String query;

    @TableField("db")
    private String db;

    @TableField("full_scan")
    private String fullScan;

    @TableField("exec_count")
    private Long execCount;

    @TableField("err_count")
    private Long errCount;

    @TableField("warn_count")
    private Long warnCount;

    @TableField("total_latency")
    private Long totalLatency;

    @TableField("max_latency")
    private Long maxLatency;

    @TableField("avg_latency")
    private Long avgLatency;

    @TableField("rows_sent")
    private Long rowsSent;

    @TableField("rows_sent_avg")
    private BigDecimal rowsSentAvg;

    @TableField("rows_examined")
    private Long rowsExamined;

    @TableField("rows_examined_avg")
    private BigDecimal rowsExaminedAvg;

    @TableField("first_seen")
    private LocalDateTime firstSeen;

    @TableField("last_seen")
    private LocalDateTime lastSeen;

    @TableField("digest")
    private String digest;


}
