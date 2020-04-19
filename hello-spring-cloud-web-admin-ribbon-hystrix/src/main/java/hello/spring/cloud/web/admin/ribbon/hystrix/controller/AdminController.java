package hello.spring.cloud.web.admin.ribbon.hystrix.controller;

import hello.spring.cloud.web.admin.ribbon.hystrix.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String message){
        return adminService.sayHi(message);
    }
}
