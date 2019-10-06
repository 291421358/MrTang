package com.curise.eshop.email.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;
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
public class InnodbLockWaits implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("wait_started")
    private LocalDateTime waitStarted;

    @TableField("wait_age")
    private LocalTime waitAge;

    @TableField("wait_age_secs")
    private Long waitAgeSecs;

    @TableField("locked_table")
    private String lockedTable;

    @TableField("locked_table_schema")
    private String lockedTableSchema;

    @TableField("locked_table_name")
    private String lockedTableName;

    @TableField("locked_table_partition")
    private String lockedTablePartition;

    @TableField("locked_table_subpartition")
    private String lockedTableSubpartition;

    @TableField("locked_index")
    private String lockedIndex;

    @TableField("locked_type")
    private String lockedType;

    @TableField("waiting_trx_id")
    private String waitingTrxId;

    @TableField("waiting_trx_started")
    private LocalDateTime waitingTrxStarted;

    @TableField("waiting_trx_age")
    private LocalTime waitingTrxAge;

    @TableField("waiting_trx_rows_locked")
    private Long waitingTrxRowsLocked;

    @TableField("waiting_trx_rows_modified")
    private Long waitingTrxRowsModified;

    @TableField("waiting_pid")
    private Long waitingPid;

    @TableField("waiting_query")
    private String waitingQuery;

    @TableField("waiting_lock_id")
    private String waitingLockId;

    @TableField("waiting_lock_mode")
    private String waitingLockMode;

    @TableField("blocking_trx_id")
    private String blockingTrxId;

    @TableField("blocking_pid")
    private Long blockingPid;

    @TableField("blocking_query")
    private String blockingQuery;

    @TableField("blocking_lock_id")
    private String blockingLockId;

    @TableField("blocking_lock_mode")
    private String blockingLockMode;

    @TableField("blocking_trx_started")
    private LocalDateTime blockingTrxStarted;

    @TableField("blocking_trx_age")
    private LocalTime blockingTrxAge;

    @TableField("blocking_trx_rows_locked")
    private Long blockingTrxRowsLocked;

    @TableField("blocking_trx_rows_modified")
    private Long blockingTrxRowsModified;

    @TableField("sql_kill_blocking_query")
    private String sqlKillBlockingQuery;

    @TableField("sql_kill_blocking_connection")
    private String sqlKillBlockingConnection;


}
