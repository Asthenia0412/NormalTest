package com.xiaoyongcai.io.normaltestmodule.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bye")
public class ByeController {
    @RequestMapping("/bye")
    public String sayBye(){
        return "再见";
    }
}
