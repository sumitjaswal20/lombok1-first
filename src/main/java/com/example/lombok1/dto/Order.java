package com.example.lombok1.dto;

import com.example.lombok1.entity.Customer;
import com.example.lombok1.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private Customer customer;

}
