package com.qf.springboot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.*;

/**
 * @Author Object
 * @Date 2019/7/30
 */
@Data
@AllArgsConstructor
public class Teacher {
    @NotNull
    private String name;
    @Pattern(regexp = "^1(3|4|5|7|8)\\d{9}$",message = "手机格式不正确")
    @NotBlank(message = "手机号码不能为空！")
    private String phone;
    @Email(message = "邮箱格式不正确")
    private String email;
    @Min(18)
    private Integer age;
}
