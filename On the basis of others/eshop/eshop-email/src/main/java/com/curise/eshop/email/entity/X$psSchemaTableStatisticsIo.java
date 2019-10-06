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
public class X$psSchemaTableStatisticsIo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("table_schema")
    private String tableSchema;

    @TableField("table_name")
    private String tableName;

    @TableField("count_read")
    private BigDecimal countRead;

    @TableField("sum_number_of_bytes_read")
    private BigDecimal sumNumberOfBytesRead;

    @TableField("sum_timer_read")
    private BigDecimal sumTimerRead;

    @TableField("count_write")
    private BigDecimal countWrite;

    @TableField("sum_number_of_bytes_write")
    private BigDecimal sumNumberOfBytesWrite;

    @TableField("sum_timer_write")
    private BigDecimal sumTimerWrite;

    @TableField("count_misc")
    private BigDecimal countMisc;

    @TableField("sum_timer_misc")
    private BigDecimal sumTimerMisc;


}
