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
public class IoGlobalByFileByBytes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("file")
    private String file;

    @TableField("count_read")
    private Long countRead;

    @TableField("total_read")
    private String totalRead;

    @TableField("avg_read")
    private String avgRead;

    @TableField("count_write")
    private Long countWrite;

    @TableField("total_written")
    private String totalWritten;

    @TableField("avg_write")
    private String avgWrite;

    @TableField("total")
    private String total;

    @TableField("write_pct")
    private BigDecimal writePct;


}
