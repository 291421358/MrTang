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
public class IoGlobalByWaitByLatency implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("event_name")
    private String eventName;

    @TableField("total")
    private Long total;

    @TableField("total_latency")
    private String totalLatency;

    @TableField("avg_latency")
    private String avgLatency;

    @TableField("max_latency")
    private String maxLatency;

    @TableField("read_latency")
    private String readLatency;

    @TableField("write_latency")
    private String writeLatency;

    @TableField("misc_latency")
    private String miscLatency;

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

    @TableField("avg_written")
    private String avgWritten;


}
