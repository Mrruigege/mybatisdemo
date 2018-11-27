package com.rui.mybatisdemo.controller;

import com.rui.mybatisdemo.service.IStudentService;
import com.rui.mybatisdemo.vo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class SampleController {
    @Resource
    private IStudentService iStudentService;
    @GetMapping("/get")
    @ResponseBody
    public Student getall(){
        Student all = this.iStudentService.list();
        return all;
    }
}
