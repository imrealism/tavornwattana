package com.tw.tavorn.dto;

import com.tw.tavorn.entity.Product;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

public class DTOMapper {

    public static ProductDto productMapper(Product product){
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
        mapperFactory.classMap(ProductDto.class, Product.class);
        MapperFacade mapper = mapperFactory.getMapperFacade();
        ProductDto postDto = mapper.map(product, ProductDto.class);
        return postDto;
    }
}
