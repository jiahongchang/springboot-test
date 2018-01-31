package com.jhc.springbootutils.helper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by ThinkPad on 2018/1/30.
 */
public class CommonMethod {
    public static Date getCurDate(){
        Date date = new Date();
        return date;
    }
}
