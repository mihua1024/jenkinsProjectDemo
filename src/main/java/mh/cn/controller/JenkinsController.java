package mh.cn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class JenkinsController {

    @GetMapping("/jenkins")
    public String info(){
        return "jenkins部署成功";
    }
}
