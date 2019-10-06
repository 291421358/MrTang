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
public class InnodbBufferStatsBySchema implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("object_schema")
    private String objectSchema;

    @TableField("allocated")
    private String allocated;

    @TableField("data")
    private String data;

    @TableField("pages")
    private Long pages;

    @TableField("pages_hashed")
    private Long pagesHashed;

    @TableField("pages_old")
    private Long pagesOld;

    @TableField("rows_cached")
    private BigDecimal rowsCached;


}
