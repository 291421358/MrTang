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
public class X$hostSummary implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("host")
    private String host;

    @TableField("statements")
    private BigDecimal statements;

    @TableField("statement_latency")
    private BigDecimal statementLatency;

    @TableField("statement_avg_latency")
    private BigDecimal statementAvgLatency;

    @TableField("table_scans")
    private BigDecimal tableScans;

    @TableField("file_ios")
    private BigDecimal fileIos;

    @TableField("file_io_latency")
    private BigDecimal fileIoLatency;

    @TableField("current_connections")
    private BigDecimal currentConnections;

    @TableField("total_connections")
    private BigDecimal totalConnections;

    @TableField("unique_users")
    private Long uniqueUsers;

    @TableField("current_memory")
    private BigDecimal currentMemory;

    @TableField("total_memory_allocated")
    private BigDecimal totalMemoryAllocated;


}
