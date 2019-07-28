package com.tw.tavorn.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
@Data
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "TYPE_ID", nullable = false)
    private long typeId;

    @Column(name = "NAME", length = 64, nullable = false)
    private String name;

    @Column(name = "IMAGE", length = 64, nullable = false)
    private String image;

    @Column(name = "STATUS_ID",length = 64 , nullable = false)
    private String statusId;

}
