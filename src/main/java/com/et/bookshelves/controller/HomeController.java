package com.et.bookshelves.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  

public class HomeController {  
    /**  
  
     * 返回html模板.  
  
     */  
  
    @RequestMapping("/hello")
    @ResponseBody
    public String helloHtml(Map<String,Object> map){  
  
       //map.put("hello","from TemplateController.helloHtml");  
       return "hello";  
    }

    @RequestMapping({"/", "/index", "index.html"})
    
    public String index(Map<String,Object> map){  
  
       //map.put("hello","from TemplateController.helloHtml");  
       return "index";  
    } 
}  