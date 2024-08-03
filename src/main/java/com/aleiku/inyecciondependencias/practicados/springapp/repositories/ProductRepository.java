package com.aleiku.inyecciondependencias.practicados.springapp.repositories;

import java.util.Arrays;
import java.util.List;

import com.aleiku.inyecciondependencias.practicados.springapp.models.Product;

public class ProductRepository {

    private List <Product> products;


    public ProductRepository() {
        this.products = Arrays.asList(
            new Product(1L,"Nintendo Switch",300L),
            new Product(2L,"The Legend Of Zelda: Tears of the Kingdom",70L),
            new Product(3L,"Splatoon 3",70L),
            new Product(4L,"Animal Crossing: New Horizon",50L)
        );
    }

    public List<Product> findAll(){
        return products;

    }

    public Product findById(Long id){

        // var findProduct = products.stream().filter(p->p.getId().equals(id)).findFirst();

        // if (findProduct.isPresent()){
        //     return findProduct.get();

        // }else{
        //     return null;
        // }
        return products.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);



    }

    

}
