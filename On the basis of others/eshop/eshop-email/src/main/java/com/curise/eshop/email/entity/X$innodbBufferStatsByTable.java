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
public class X$innodbBufferStatsByTable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("object_schema")
    private String objectSchema;

    @TableField("object_name")
    private String objectName;

    @TableField("allocated")
    private BigDecimal allocated;

    @TableField("data")
    private BigDecimal data;

    @TableField("pages")
    private Long pages;

    @TableField("pages_hashed")
    private Long pagesHashed;

    @TableField("pages_old")
    private Long pagesOld;

    @TableField("rows_cached")
    private BigDecimal rowsCached;


}
