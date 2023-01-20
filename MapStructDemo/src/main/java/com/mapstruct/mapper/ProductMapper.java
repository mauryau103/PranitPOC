package com.mapstruct.mapper;

import com.mapstruct.dto.ProductDto;
import com.mapstruct.model.Product;
import com.mapstruct.validator.ProductValidationException;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.UUID;

@Mapper(uses = {ProductValidationException.class},componentModel = "spring"/* ,imports = UUID.class*/)
public interface ProductMapper {

    ProductMapper Instance = Mappers.getMapper(ProductMapper.class);

//    @Mapping(source = "product.desc",target = "description",defaultValue = "description")
 //   @Mapping(target = "itemId",expression = "java(UUID.randomUUID().toString())")
 //   @Mapping(source = "product.items",target = "itemList")
    ProductDto modelToDto(Product product) throws ProductValidationException;


    List<ProductDto> modelsToDto(List<Product> product) throws ProductValidationException;


   // @Mapping(source = "productDto.description",target = "desc",defaultValue = "description")
    @InheritInverseConfiguration
    Product dtoToModel(ProductDto productDto) throws ProductValidationException;


}
