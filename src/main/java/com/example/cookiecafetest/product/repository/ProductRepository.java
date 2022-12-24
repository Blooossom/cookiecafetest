package com.example.cookiecafetest.product.repository;


import com.example.cookiecafetest.mapper.ProductMapper;
import com.example.cookiecafetest.product.dto.Product;
import com.example.cookiecafetest.product.dto.ProductList;
import com.example.cookiecafetest.util.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    ProductMapper mapper;


    public List<Product> findAll(SearchDTO params){
        return mapper.findAll(params);
    }
    public int count(SearchDTO params){
        return mapper.count(params);
    }

    public Product checkAmountProduct(Product product){
        return mapper.checkAmountProduct(product);
    }

    public int selectAvailAmount(Product product){
        return mapper.selectAvailAmount(product);
    }

    public ProductList checkAvailProductId(){
        return mapper.checkAvailProductId();
    }




}




