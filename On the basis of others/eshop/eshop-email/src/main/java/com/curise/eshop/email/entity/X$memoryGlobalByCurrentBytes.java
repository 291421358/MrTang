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
public class X$memoryGlobalByCurrentBytes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("event_name")
    private String eventName;

    @TableField("current_count")
    private Long currentCount;

    @TableField("current_alloc")
    private Long currentAlloc;

    @TableField("current_avg_alloc")
    private BigDecimal currentAvgAlloc;

    @TableField("high_count")
    private Long highCount;

    @TableField("high_alloc")
    private Long highAlloc;

    @TableField("high_avg_alloc")
    private BigDecimal highAvgAlloc;


}
