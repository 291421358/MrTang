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
public class IoByThreadByLatency implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("user")
    private String user;

    @TableField("total")
    private BigDecimal total;

    @TableField("total_latency")
    private String totalLatency;

    @TableField("min_latency")
    private String minLatency;

    @TableField("avg_latency")
    private String avgLatency;

    @TableField("max_latency")
    private String maxLatency;

    @TableField("thread_id")
    private Long threadId;

    @TableField("processlist_id")
    private Long processlistId;


}
