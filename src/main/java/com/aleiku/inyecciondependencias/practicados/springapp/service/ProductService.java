package com.aleiku.inyecciondependencias.practicados.springapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aleiku.inyecciondependencias.practicados.springapp.models.Product;

public interface ProductService {
    
    List<Product> findAll();

    Product findById(Long id);

    };

    
