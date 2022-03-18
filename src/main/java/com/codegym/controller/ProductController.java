package com.codegym.controller;

import com.codegym.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("create");
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createProduct(@RequestParam Integer id,
                                      @RequestParam String name,
                                      @RequestParam String price) {
        Product product = new Product(id, name, price);
        ModelAndView modelAndView = new ModelAndView("index", "product", product);
        return modelAndView;
    }

    @PostMapping("/create2")
    public ModelAndView createProduct2(@ModelAttribute Product product){
        ModelAndView modelAndView = new ModelAndView("index", "product", product);
        return modelAndView;
    }
}
