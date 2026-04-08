package com.hellospring.demo.member.controller.dto;

import lombok.Data;

@Data
public class JoinRequest {

    private String id;

    private String name;

    private int age;

    private String hobby;
    
}
