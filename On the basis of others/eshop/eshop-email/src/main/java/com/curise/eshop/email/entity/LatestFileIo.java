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
public class LatestFileIo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("thread")
    private String thread;

    @TableField("file")
    private String file;

    @TableField("latency")
    private String latency;

    @TableField("operation")
    private String operation;

    @TableField("requested")
    private String requested;


}
