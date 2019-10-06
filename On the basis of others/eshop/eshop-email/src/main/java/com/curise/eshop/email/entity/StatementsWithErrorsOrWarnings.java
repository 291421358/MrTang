package com.curise.eshop.email.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
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
public class StatementsWithErrorsOrWarnings implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("query")
    private String query;

    @TableField("db")
    private String db;

    @TableField("exec_count")
    private Long execCount;

    @TableField("errors")
    private Long errors;

    @TableField("error_pct")
    private BigDecimal errorPct;

    @TableField("warnings")
    private Long warnings;

    @TableField("warning_pct")
    private BigDecimal warningPct;

    @TableField("first_seen")
    private LocalDateTime firstSeen;

    @TableField("last_seen")
    private LocalDateTime lastSeen;

    @TableField("digest")
    private String digest;


}
