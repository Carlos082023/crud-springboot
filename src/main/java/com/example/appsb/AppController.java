/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.appsb;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class AppController {
    
    @Autowired
    
    private ProductService service;
    @RequestMapping("/")
    public String viewHomePAge(Model model){
    List<Product> listProducts = service.listAll();
     model.addAttribute("listProducts",listProducts);
    return("index");
    }
    
}
