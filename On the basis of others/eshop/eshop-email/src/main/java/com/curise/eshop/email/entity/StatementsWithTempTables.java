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
public class StatementsWithTempTables implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("query")
    private String query;

    @TableField("db")
    private String db;

    @TableField("exec_count")
    private Long execCount;

    @TableField("total_latency")
    private String totalLatency;

    @TableField("memory_tmp_tables")
    private Long memoryTmpTables;

    @TableField("disk_tmp_tables")
    private Long diskTmpTables;

    @TableField("avg_tmp_tables_per_query")
    private BigDecimal avgTmpTablesPerQuery;

    @TableField("tmp_tables_to_disk_pct")
    private BigDecimal tmpTablesToDiskPct;

    @TableField("first_seen")
    private LocalDateTime firstSeen;

    @TableField("last_seen")
    private LocalDateTime lastSeen;

    @TableField("digest")
    private String digest;


}
