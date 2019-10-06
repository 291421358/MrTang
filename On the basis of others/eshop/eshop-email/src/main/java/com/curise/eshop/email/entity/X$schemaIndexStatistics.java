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
public class X$schemaIndexStatistics implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("table_schema")
    private String tableSchema;

    @TableField("table_name")
    private String tableName;

    @TableField("index_name")
    private String indexName;

    @TableField("rows_selected")
    private Long rowsSelected;

    @TableField("select_latency")
    private Long selectLatency;

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


}
