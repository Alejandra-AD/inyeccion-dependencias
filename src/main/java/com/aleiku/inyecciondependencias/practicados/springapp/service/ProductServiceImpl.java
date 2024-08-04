package com.aleiku.inyecciondependencias.practicados.springapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.aleiku.inyecciondependencias.practicados.springapp.models.Product;
import com.aleiku.inyecciondependencias.practicados.springapp.repositories.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {// Se puede hacer logica de negocio

    private ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    public List <Product> findAll(){
        return productRepository.findAll().stream().map(product -> {

            Double priceTax = product.getPrice() * 1.25d;
            Product newProduct = (Product)product.clone();
            newProduct.setPrice(priceTax.longValue());
            return newProduct;//devuelvo el producto modificado

        }).collect(Collectors.toList());
    }

    public Product findById(Long id){

        return productRepository.findById(id);
    }

}
