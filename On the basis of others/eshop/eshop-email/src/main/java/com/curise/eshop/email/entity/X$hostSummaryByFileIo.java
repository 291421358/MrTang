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
public class X$hostSummaryByFileIo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("host")
    private String host;

    @TableField("ios")
    private BigDecimal ios;

    @TableField("io_latency")
    private BigDecimal ioLatency;


}
