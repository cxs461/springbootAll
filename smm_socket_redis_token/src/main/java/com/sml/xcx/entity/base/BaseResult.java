package com.sml.xcx.entity.base;

import com.sml.xcx.common.CodeEnum;
import com.sml.xcx.common.ToString;
import lombok.Data;

/**
 * @author :mmzs
 * @description:TODO
 * @date :2020/05/28 14:49
 */
@Data
public class BaseResult extends ToString {
    /**
     * 用于唯一标识一次请求
     */
    private String requestId;

    /**
     * 响应码
     */
    private Integer code = CodeEnum.code8200.getCode();

    /**
     * 响应提示信息
     */
    private String msg;

    private String errmsg;
}
