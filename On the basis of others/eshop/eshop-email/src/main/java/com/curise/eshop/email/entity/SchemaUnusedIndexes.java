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
public class SchemaUnusedIndexes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("object_schema")
    private String objectSchema;

    @TableField("object_name")
    private String objectName;

    @TableField("index_name")
    private String indexName;


}
