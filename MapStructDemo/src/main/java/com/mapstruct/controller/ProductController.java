package com.mapstruct.controller;

import com.mapstruct.dto.ProductDto;
import com.mapstruct.mapper.ProductMapper;
import com.mapstruct.model.Product;
import com.mapstruct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductRepository productRepository;


    @PostMapping("/productSave")
    public ResponseEntity<Product> save(@RequestBody ProductDto productDto){
        return new ResponseEntity<>(productRepository.save(
                productMapper.dtoToModel(productDto)), HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> findAll(){
        return new ResponseEntity<>(productMapper.modelsToDto(productRepository.findAll()),HttpStatus.OK);
      //  return null;
    }

    @GetMapping("/products/{id}")
    public ResponseEntity<ProductDto> findById(@PathVariable(value = "id")Integer id){
        return new ResponseEntity<>(productMapper.modelToDto(productRepository.findById(id).get()),HttpStatus.OK);
        //  return null;
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable(value = "id")Integer id){
        ProductDto productDto = productMapper.modelToDto(productRepository.findById(id).get());
        productRepository.deleteById(productDto.getId());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        //  return null;
    }
}