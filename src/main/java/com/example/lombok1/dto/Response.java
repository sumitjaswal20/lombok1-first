package com.example.lombok1.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Response {

    String name;
    String productname;
    int price;

    public Response(String name, String productname) {
        this.name = name;
        this.productname = productname;
    }
}
