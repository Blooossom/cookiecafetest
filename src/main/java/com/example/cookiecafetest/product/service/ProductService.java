package com.example.cookiecafetest.product.service;


import com.example.cookiecafetest.product.dto.Product;
import com.example.cookiecafetest.product.repository.ProductRepository;
import com.example.cookiecafetest.util.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    ProductRepository pr;


    public List<Product> findAll(SearchDTO params){
        return pr.findAll(params);
    }

}
