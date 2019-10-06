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
public class Processlist implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("thd_id")
    private Long thdId;

    @TableField("conn_id")
    private Long connId;

    @TableField("user")
    private String user;

    @TableField("db")
    private String db;

    @TableField("command")
    private String command;

    @TableField("state")
    private String state;

    @TableField("time")
    private Long time;

    @TableField("current_statement")
    private String currentStatement;

    @TableField("statement_latency")
    private String statementLatency;

    @TableField("progress")
    private BigDecimal progress;

    @TableField("lock_latency")
    private String lockLatency;

    @TableField("rows_examined")
    private Long rowsExamined;

    @TableField("rows_sent")
    private Long rowsSent;

    @TableField("rows_affected")
    private Long rowsAffected;

    @TableField("tmp_tables")
    private Long tmpTables;

    @TableField("tmp_disk_tables")
    private Long tmpDiskTables;

    @TableField("full_scan")
    private String fullScan;

    @TableField("last_statement")
    private String lastStatement;

    @TableField("last_statement_latency")
    private String lastStatementLatency;

    @TableField("current_memory")
    private String currentMemory;

    @TableField("last_wait")
    private String lastWait;

    @TableField("last_wait_latency")
    private String lastWaitLatency;

    @TableField("source")
    private String source;

    @TableField("trx_latency")
    private String trxLatency;

    @TableField("trx_state")
    private String trxState;

    @TableField("trx_autocommit")
    private String trxAutocommit;

    @TableField("pid")
    private String pid;

    @TableField("program_name")
    private String programName;


}
