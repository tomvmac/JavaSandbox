package com.tom.controller;

import com.config.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

@Controller
@RequestMapping("/hello")
public class TomController {

    @Autowired
    private MyConfiguration myConfiguration;

    @RequestMapping(value = "/{firstName}", method = RequestMethod.GET)
    public String getMovie(@PathVariable String firstName, ModelMap model) throws IOException {

        Properties properties = new Properties();

        try{
            properties.load(new FileInputStream(System.getenv("MY_SETTINGS_FOLDER") + "/mysettings.properties"));
            model.addAttribute("dbName", properties.getProperty("dbName"));
        }
        catch(Exception ex){
            System.out.print(ex.getMessage());
        }

        model.addAttribute("firstName", firstName);
        model.addAttribute("environmentName", myConfiguration.getEnvironmentName());
        model.addAttribute("portNumber", myConfiguration.getPortNumber());


        return "hello";

    }

}
