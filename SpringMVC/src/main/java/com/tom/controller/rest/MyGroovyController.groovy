package com.tom.controller.rest

import com.config.MyConfiguration
import com.tom.domainobject.Person
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 11/30/13
 * Time: 7:45 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/mygroovy")
class MyGroovyController {


    @RequestMapping("/person/random")
    @ResponseBody
    public Person randomPerson() {
        Person person = new Person("Kobe", "Bryant");
        return person;
    }


}
