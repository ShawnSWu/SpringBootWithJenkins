package com.jenkins.springbootwithjenkins;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootwithjenkinsApplicationTests {

    private MockMvc mvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup(){
        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void contextLoads() throws Exception{
        String uri = "/";
        MvcResult result = mvc.perform(
                MockMvcRequestBuilders
                .get(uri)
                .accept(MediaType.APPLICATION_JSON))
                .andReturn();

        int status = result.getResponse().getStatus();
        System.out.println(status);
        Assert.assertEquals("錯誤",200,status);
    }

    @Test
    public void Api1() throws Exception{
        String uri = "/api/1";
        MvcResult result = mvc.perform(
                MockMvcRequestBuilders
                        .get(uri)
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn();

        int status = result.getResponse().getStatus();
        System.out.println(status);
        Assert.assertEquals("錯誤",200,status);
    }

    @Test
    public void Api2() throws Exception{
        String uri = "/api/2";
        MvcResult result = mvc.perform(
                MockMvcRequestBuilders
                        .get(uri)
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn();

        int status = result.getResponse().getStatus();
        System.out.println(status);
        Assert.assertEquals("錯誤",200,status);
    }

    @Test
    public void Api3() throws Exception{
        String uri = "/api/3";
        MvcResult result = mvc.perform(
                MockMvcRequestBuilders
                        .get(uri)
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn();

        int status = result.getResponse().getStatus();
        System.out.println(status);
        Assert.assertEquals("錯誤",200,status);
    }

    @Test
    public void Api4() throws Exception{
        String uri = "/api/4";
        MvcResult result = mvc.perform(
                MockMvcRequestBuilders
                        .get(uri)
                        .accept(MediaType.APPLICATION_JSON))
                .andReturn();

        int status = result.getResponse().getStatus();
        System.out.println(status);
        Assert.assertEquals("錯誤",200,status);
    }

}
