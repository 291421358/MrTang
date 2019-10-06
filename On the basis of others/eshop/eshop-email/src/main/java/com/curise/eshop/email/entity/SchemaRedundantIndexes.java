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
public class SchemaRedundantIndexes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("table_schema")
    private String tableSchema;

    @TableField("table_name")
    private String tableName;

    @TableField("redundant_index_name")
    private String redundantIndexName;

    @TableField("redundant_index_columns")
    private String redundantIndexColumns;

    @TableField("redundant_index_non_unique")
    private Integer redundantIndexNonUnique;

    @TableField("dominant_index_name")
    private String dominantIndexName;

    @TableField("dominant_index_columns")
    private String dominantIndexColumns;

    @TableField("dominant_index_non_unique")
    private Integer dominantIndexNonUnique;

    @TableField("subpart_exists")
    private Integer subpartExists;

    @TableField("sql_drop_index")
    private String sqlDropIndex;


}
