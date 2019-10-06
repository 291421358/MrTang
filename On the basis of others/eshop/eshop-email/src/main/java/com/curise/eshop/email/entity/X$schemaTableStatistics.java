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
public class X$schemaTableStatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("table_schema")
    private String tableSchema;

    @TableField("table_name")
    private String tableName;

    @TableField("total_latency")
    private Long totalLatency;

    @TableField("rows_fetched")
    private Long rowsFetched;

    @TableField("fetch_latency")
    private Long fetchLatency;

    @TableField("rows_inserted")
    private Long rowsInserted;

    @TableField("insert_latency")
    private Long insertLatency;

    @TableField("rows_updated")
    private Long rowsUpdated;

    @TableField("update_latency")
    private Long updateLatency;

    @TableField("rows_deleted")
    private Long rowsDeleted;

    @TableField("delete_latency")
    private Long deleteLatency;

    @TableField("io_read_requests")
    private BigDecimal ioReadRequests;

    @TableField("io_read")
    private BigDecimal ioRead;

    @TableField("io_read_latency")
    private BigDecimal ioReadLatency;

    @TableField("io_write_requests")
    private BigDecimal ioWriteRequests;

    @TableField("io_write")
    private BigDecimal ioWrite;

    @TableField("io_write_latency")
    private BigDecimal ioWriteLatency;

    @TableField("io_misc_requests")
    private BigDecimal ioMiscRequests;

    @TableField("io_misc_latency")
    private BigDecimal ioMiscLatency;


}
