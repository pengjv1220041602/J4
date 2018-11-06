package com.u4.controller;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import com.u4.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class)
@WebMvcTest(StudentController.class)
public class StudentControllerTest {

    @MockBean
    private StudentService studentService;

    @Autowired
    private MockMvc mvc;

    @Test
    public void studentById() throws Exception {

//        RestAssuredMockMvc.given().



        mvc.perform(MockMvcRequestBuilders.get("/student/{id}", "333"))
                .andExpect(MockMvcResultMatchers.content().json("/333aaaaaa"));

    }
    @Test
    public void studentByName() {
        System.out.println("this is by name");
    }
}