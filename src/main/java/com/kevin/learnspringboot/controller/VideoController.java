package com.kevin.learnspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * @ClassName VideoController
 * @Description 测试的Controller
 * @Author Kevin
 * @Date 2020/11/2 4:53 下午
 * @Version
 */
@RestController
@RequestMapping("/api/v1")
public class VideoController {

    @RequestMapping("/list")
    public Object videoList() {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("vip", "kevin");
        stringStringHashMap.put("not vip", "yemao");
        return stringStringHashMap;
    }
}
