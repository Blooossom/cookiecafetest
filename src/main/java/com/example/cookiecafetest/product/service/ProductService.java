package com.example.cookiecafetest.product.service;


import com.example.cookiecafetest.product.dto.Product;
import com.example.cookiecafetest.product.dto.ProductList;
import com.example.cookiecafetest.product.repository.ProductRepository;
import com.example.cookiecafetest.util.Pagination;
import com.example.cookiecafetest.util.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductService {


    @Autowired
    ProductRepository pr;


    public ProductList findAll(SearchDTO params){
        int count = pr.count(params);

        if(count < 1){
            return new ProductList(Collections.emptyList(), null);
        }
        Pagination pagination = new Pagination(count, params);
        params.setPagination(pagination);

        List<Product> list = pr.findAll(params);
        return new ProductList(list, pagination);
    }
    public int selectAvailAmount(Product product){
        return pr.selectAvailAmount(product);
    }
    public ProductList checkAvailProductId(){
        return pr.checkAvailProductId();
    }

    public Product checkAmountProduct(Product product){
        return pr.checkAmountProduct(product);
    }
}
