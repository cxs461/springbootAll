package com.sml.xcx.common;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author :mmzs
 * @description:TODO
 * @date :2020/05/28 14:18
 */
public class ToString implements Serializable {

    private static final long serialVersionUID = 2804430141970319764L;

    public ToString(){
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
