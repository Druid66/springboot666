package com.qf.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author Object
 * @Date 2019/7/30
 */
@Data
@AllArgsConstructor
public class ResultBean<T> {
    private String respCode;
    private T data;

}
