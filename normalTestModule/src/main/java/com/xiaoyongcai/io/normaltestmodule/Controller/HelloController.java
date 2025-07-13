package com.xiaoyongcai.io.normaltestmodule.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/normal")
    public String normalHello(){
        return "这是一首简单的小情歌";
    }
}
