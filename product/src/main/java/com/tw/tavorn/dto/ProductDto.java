package com.tw.tavorn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;

@Data
@AllArgsConstructor
public class ProductDto {
    private Long id;
    private long typeId;
    private String name;
    private String statusId;

}
