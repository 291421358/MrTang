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
public class SchemaTableStatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("table_schema")
    private String tableSchema;

    @TableField("table_name")
    private String tableName;

    @TableField("total_latency")
    private String totalLatency;

    @TableField("rows_fetched")
    private Long rowsFetched;

    @TableField("fetch_latency")
    private String fetchLatency;

    @TableField("rows_inserted")
    private Long rowsInserted;

    @TableField("insert_latency")
    private String insertLatency;

    @TableField("rows_updated")
    private Long rowsUpdated;

    @TableField("update_latency")
    private String updateLatency;

    @TableField("rows_deleted")
    private Long rowsDeleted;

    @TableField("delete_latency")
    private String deleteLatency;

    @TableField("io_read_requests")
    private BigDecimal ioReadRequests;

    @TableField("io_read")
    private String ioRead;

    @TableField("io_read_latency")
    private String ioReadLatency;

    @TableField("io_write_requests")
    private BigDecimal ioWriteRequests;

    @TableField("io_write")
    private String ioWrite;

    @TableField("io_write_latency")
    private String ioWriteLatency;

    @TableField("io_misc_requests")
    private BigDecimal ioMiscRequests;

    @TableField("io_misc_latency")
    private String ioMiscLatency;


}
