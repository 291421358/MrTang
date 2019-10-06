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
public class X$statementsWithSorting implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("query")
    private String query;

    @TableField("db")
    private String db;

    @TableField("exec_count")
    private Long execCount;

    @TableField("total_latency")
    private Long totalLatency;

    @TableField("sort_merge_passes")
    private Long sortMergePasses;

    @TableField("avg_sort_merges")
    private BigDecimal avgSortMerges;

    @TableField("sorts_using_scans")
    private Long sortsUsingScans;

    @TableField("sort_using_range")
    private Long sortUsingRange;

    @TableField("rows_sorted")
    private Long rowsSorted;

    @TableField("avg_rows_sorted")
    private BigDecimal avgRowsSorted;

    @TableField("first_seen")
    private LocalDateTime firstSeen;

    @TableField("last_seen")
    private LocalDateTime lastSeen;

    @TableField("digest")
    private String digest;


}
