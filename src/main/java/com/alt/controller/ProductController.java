package com.alt.controller;

import com.alt.dto.ProductDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    @RequestMapping(value = "/")
    public String getRegistrationPage(Model model){
    model.addAttribute("product",new ProductDTO());
    return "register";
    }
//
    @PostMapping(value="/register")
    public String registerProduct(@ModelAttribute("product") ProductDTO product, Model model) {
        // code to save product via service
        return "success"; // or redirect page
    }

}
