package com.example.cookiecafetest.product.repository;


import com.example.cookiecafetest.mapper.ProductMapper;
import com.example.cookiecafetest.product.dto.Product;
import com.example.cookiecafetest.util.SearchDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    ProductMapper mapper;


    public List<Product> findAll(SearchDTO searchDTO){
        return mapper.find(searchDTO);
    }




}




