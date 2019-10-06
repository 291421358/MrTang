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
public class SchemaObjectOverview implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("db")
    private String db;

    @TableField("object_type")
    private String objectType;

    @TableField("count")
    private Long count;


}
