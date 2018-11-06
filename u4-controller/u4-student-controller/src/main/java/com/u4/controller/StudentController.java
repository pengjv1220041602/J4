package com.u4.controller;

import com.u4.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author ZhPJ
 * @Date 2018/11/6 000616:57
 * @Version 1.0
 * @Description:
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(path = "/student/{id}")
    @ResponseBody
    public String studentById (@PathVariable("id") String id) {
        String s = studentService.studentById(id) + "aaaaaa";
        return s;
    }

    @RequestMapping(path = "/student/{name}")
    @ResponseBody
    public String studentByName (@PathVariable("name")String name) {
        return name;
    }
}
