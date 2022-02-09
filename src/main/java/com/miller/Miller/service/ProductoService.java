package com.miller.Miller.service;

import com.miller.Miller.model.Producto;
import com.miller.Miller.repo.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public List<Producto> getAllProductos(){
        List<Producto> productos = new ArrayList<>();
        productoRepository.findAll().forEach(producto -> productos.add(producto));
        return productos;
    }
}
