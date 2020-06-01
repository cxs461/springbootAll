package com.sml.xcx.entity.base;

import com.sml.xcx.common.CodeEnum;
import com.sml.xcx.entity.base.BaseResult;

/**
 * @author :cxs
 * @description:互动平台的客户端响应实体类。
 * @date :2020/05/28 14:55
 */
public class Result<T> extends BaseResult {
    /**
     * 响应结果数据
     */
    private T result;

    public Result(){

    }

    public Result(CodeEnum codeEnum) {
        this.setCode(codeEnum.getCode());
        this.setErrmsg(codeEnum.getDesc());
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}
