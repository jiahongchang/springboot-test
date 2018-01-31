package com.jhc.springbootapi.controller;

import com.jhc.springbootutils.helper.CommonMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ThinkPad on 2018/1/30.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/date")
    public String getdate(){
        Date date = CommonMethod.getCurDate();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "当前时间"+simpleDateFormat.format(date);
    }
}
