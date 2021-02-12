package com.kevin.learnspringboot.entity;

import lombok.Data;

/**
 * @ClassName Student
 * @Description Student
 * @Author Kevin
 * @Date 2021/2/12 8:14 上午
 * @Version 1.0
 **/
@Data
public class Student {
    private String name;
    private String gender;
    private String phone;
    private String studentId;
    private String math;
    private String english;
}
