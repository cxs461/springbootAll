/**
 * chenxitech.cn Inc. Copyright (c) 2017-2019 All Rights Reserved.
 */
package com.sml.xcx.common;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author tangyue
 * @version $Id: SuperEntity.java, v 0.1 2019-11-05 9:58 tangyue Exp $$
 */
@Data
public class SuperEntity extends Model {

    private Long id;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}
