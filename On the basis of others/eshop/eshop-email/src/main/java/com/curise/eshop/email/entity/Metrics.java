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
public class Metrics implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("Variable_name")
    private String variableName;

    @TableField("Variable_value")
    private String variableValue;

    @TableField("Type")
    private String Type;

    @TableField("Enabled")
    private String Enabled;


}
