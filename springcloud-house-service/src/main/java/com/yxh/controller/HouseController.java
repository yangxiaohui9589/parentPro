package com.yxh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : yangxh
 * @version V1.0
 * @Project: parentPro
 * @Package com.yxh.controller
 * @Description: TODO
 * @date Date : 2019年04月07日 17:27
 */
@RestController
public class HouseController {

    @GetMapping("/getAddr")
    public String getAddr(){
        return " 西安市";
    }
}
