package com.xing.uni.controller;

import com.xing.uni.entity.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping("/xing")
public class TestController {
   @GetMapping("/test")
    public R test(){
       return R.ok("123456");
   }
}
