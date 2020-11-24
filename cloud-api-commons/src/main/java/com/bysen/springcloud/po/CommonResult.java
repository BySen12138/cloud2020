package com.bysen.springcloud.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommonResult
 * @Author Bysen
 * @Date 2020/9/20 21:26
 * @Description TODO
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //状态码，例如404 ，400 等
    private Integer code;
    //消息体
    private String message;
    private T data;

    //为data为空的情况添加构造方法
    public CommonResult(Integer code, String message){
        this(code,message,null);
    }
}
