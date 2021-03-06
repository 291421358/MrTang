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
public class X$ioGlobalByFileByLatency implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("file")
    private String file;

    @TableField("total")
    private Long total;

    @TableField("total_latency")
    private Long totalLatency;

    @TableField("count_read")
    private Long countRead;

    @TableField("read_latency")
    private Long readLatency;

    @TableField("count_write")
    private Long countWrite;

    @TableField("write_latency")
    private Long writeLatency;

    @TableField("count_misc")
    private Long countMisc;

    @TableField("misc_latency")
    private Long miscLatency;


}
