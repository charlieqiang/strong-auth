package cn.charlie.strong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author charlie
 * @date 2024/4/25 16:27
 **/
@RestController
@RequestMapping("/base")
public class BaseController {
    @GetMapping("/echo")
    public String getResult(@RequestParam String param) {
        return param;
    }
}
