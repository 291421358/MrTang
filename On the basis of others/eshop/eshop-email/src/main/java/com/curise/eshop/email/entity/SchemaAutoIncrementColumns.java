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
public class SchemaAutoIncrementColumns implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("table_schema")
    private String tableSchema;

    @TableField("table_name")
    private String tableName;

    @TableField("column_name")
    private String columnName;

    @TableField("data_type")
    private String dataType;

    @TableField("column_type")
    private String columnType;

    @TableField("is_signed")
    private Integer isSigned;

    @TableField("is_unsigned")
    private Integer isUnsigned;

    @TableField("max_value")
    private Long maxValue;

    @TableField("auto_increment")
    private Long autoIncrement;

    @TableField("auto_increment_ratio")
    private BigDecimal autoIncrementRatio;


}
