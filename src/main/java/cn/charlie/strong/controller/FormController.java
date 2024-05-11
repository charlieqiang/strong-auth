package cn.charlie.strong.controller;

import cn.charlie.strong.entity.result.Result;
import cn.charlie.strong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author charlie
 * @date 2024/4/25 16:27
 **/
@RestController
@RequestMapping("/form")
public class FormController {

    @GetMapping("")
    public Result getForm() {
        return Result.success();
    }
}
