package com.tom.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import config.BaseTestConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


import javax.annotation.Resource;




/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 12/1/13
 * Time: 10:12 AM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes=BaseTestConfig.class)
public class MyGroovyControllerTest {

    private MockMvc mockMvc;

    @Resource
    private WebApplicationContext webApplicationContext;


    @Before
    public void setUp() throws Exception {

        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

    }


    @Test
    public void testRandomPerson() throws Exception {

        String expectedJsonResult = "{\"firstName\":\"Kobe\",\"lastName\":\"Bryant\"}";

        mockMvc.perform(get("/mygroovy/person/random"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.firstName").value("Kobe"));



    }


}