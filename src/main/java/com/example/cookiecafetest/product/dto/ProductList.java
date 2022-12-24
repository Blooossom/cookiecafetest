package com.example.cookiecafetest.product.dto;

import com.example.cookiecafetest.util.Pagination;
import com.example.cookiecafetest.util.SearchDTO;

import java.util.List;

public class ProductList{

    private List<Product> list;

    private Pagination pagination;

    public ProductList(List<Product> list, Pagination pagination) {
        this.list = list;
        this.pagination = pagination;
    }

    public List<Product> getList() {
        return list;
    }

    public Pagination getPagination() {
        return pagination;
    }
}
