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
public class X$ioGlobalByFileByBytes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("file")
    private String file;

    @TableField("count_read")
    private Long countRead;

    @TableField("total_read")
    private Long totalRead;

    @TableField("avg_read")
    private BigDecimal avgRead;

    @TableField("count_write")
    private Long countWrite;

    @TableField("total_written")
    private Long totalWritten;

    @TableField("avg_write")
    private BigDecimal avgWrite;

    @TableField("total")
    private Long total;

    @TableField("write_pct")
    private BigDecimal writePct;


}
