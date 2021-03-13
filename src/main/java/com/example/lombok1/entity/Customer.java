package com.example.lombok1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customer {
   @Id
           @GeneratedValue
    int id;
    String name;
    String address;
    int mobno;
    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
            @JoinColumn(name = "cp_fk",referencedColumnName = "id")
    List<Product> product;
}
