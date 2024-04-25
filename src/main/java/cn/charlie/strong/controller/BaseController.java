package cn.charlie.strong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author charlie
 * @date 2024/4/25 16:27
 **/
@RestController
@RequestMapping("/index")
public class BaseController {
    @GetMapping("")
    public String getResult() {
        return "hello world";
    }
}
