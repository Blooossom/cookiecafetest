package com.example.cookiecafetest.page.controller;

import com.example.cookiecafetest.product.dto.Product;
import com.example.cookiecafetest.product.dto.ProductList;
import com.example.cookiecafetest.product.service.ProductService;
import com.example.cookiecafetest.util.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class PageController {
    @Autowired
    ProductService ps;

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/signupPage")
    public String signupPage() {
        return "user/signup";
    }

    @GetMapping("/loginPage")
    public String loginPage() {
        return "user/login";
    }

    @GetMapping("/aboutus")
    public String aboutus() {
        return "aboutus";
    }

    @GetMapping("/productList")
    public String openProductList(Model model, SearchDTO params){
        ProductList product = ps.findAllPost(params);
        model.addAttribute("product",product);
        String key = params.getKeyword();
        if (key != null) {
            model.addAttribute("keyword", params.getKeyword());
        }
        return "productlist";
    }
}
/*
@GetMapping("/productList")
    public String productList(SearchDTO params, Model model) {
        ProductList product = ps.findAll(params);
        model.addAttribute("product", product);
        String key=params.getKeyword();
        if(key!=null){
            model.addAttribute("keyword", params.getKeyword());
        }
        return "productlist";
    }
 */
