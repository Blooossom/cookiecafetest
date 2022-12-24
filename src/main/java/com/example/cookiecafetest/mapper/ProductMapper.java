package com.example.cookiecafetest.mapper;


import com.example.cookiecafetest.product.dto.Product;
import com.example.cookiecafetest.product.dto.ProductList;
import com.example.cookiecafetest.util.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    public List<Product> findAll(SearchDTO params);
    public int count(SearchDTO params);

    int selectAvailAmount(Product product);
    public ProductList checkAvailProductId();
    public Product checkAmountProduct(Product product);

}
