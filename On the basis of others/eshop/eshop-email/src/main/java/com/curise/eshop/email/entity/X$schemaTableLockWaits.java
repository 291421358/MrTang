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
public class X$schemaTableLockWaits implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("object_schema")
    private String objectSchema;

    @TableField("object_name")
    private String objectName;

    @TableField("waiting_thread_id")
    private Long waitingThreadId;

    @TableField("waiting_pid")
    private Long waitingPid;

    @TableField("waiting_account")
    private String waitingAccount;

    @TableField("waiting_lock_type")
    private String waitingLockType;

    @TableField("waiting_lock_duration")
    private String waitingLockDuration;

    @TableField("waiting_query")
    private String waitingQuery;

    @TableField("waiting_query_secs")
    private Long waitingQuerySecs;

    @TableField("waiting_query_rows_affected")
    private Long waitingQueryRowsAffected;

    @TableField("waiting_query_rows_examined")
    private Long waitingQueryRowsExamined;

    @TableField("blocking_thread_id")
    private Long blockingThreadId;

    @TableField("blocking_pid")
    private Long blockingPid;

    @TableField("blocking_account")
    private String blockingAccount;

    @TableField("blocking_lock_type")
    private String blockingLockType;

    @TableField("blocking_lock_duration")
    private String blockingLockDuration;

    @TableField("sql_kill_blocking_query")
    private String sqlKillBlockingQuery;

    @TableField("sql_kill_blocking_connection")
    private String sqlKillBlockingConnection;


}
