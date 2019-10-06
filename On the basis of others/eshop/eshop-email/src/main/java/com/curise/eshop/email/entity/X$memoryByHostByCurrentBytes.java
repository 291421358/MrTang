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
public class X$memoryByHostByCurrentBytes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("host")
    private String host;

    @TableField("current_count_used")
    private BigDecimal currentCountUsed;

    @TableField("current_allocated")
    private BigDecimal currentAllocated;

    @TableField("current_avg_alloc")
    private BigDecimal currentAvgAlloc;

    @TableField("current_max_alloc")
    private Long currentMaxAlloc;

    @TableField("total_allocated")
    private BigDecimal totalAllocated;


}
