package com.example.demo.test;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;


/**
 * 
 * @author dongtl
 *
 */
@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired  
    private RestTemplate restTemplate;  
      
 //  @HystrixCommand(fallbackMethod = "")
    @GetMapping("/template")  
    public String findById() {
       String s= this.restTemplate.getForObject("http://movie/test/test", String.class);  
   
        return s;  
    }  
	
}
