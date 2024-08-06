package com.aleiku.inyecciondependencias.practicados.springapp.repositories;

import java.util.List;

import com.aleiku.inyecciondependencias.practicados.springapp.models.Product;


public interface ProductRepository {

    List <Product> findAll();

    Product findById (Long id);


}
