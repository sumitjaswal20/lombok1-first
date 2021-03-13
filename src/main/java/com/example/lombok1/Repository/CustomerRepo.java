package com.example.lombok1.Repository;

import com.example.lombok1.dto.Order;
import com.example.lombok1.dto.Response;
import com.example.lombok1.entity.Customer;
import com.sun.org.apache.xpath.internal.objects.XString;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    //@Query("select c.address,c.name,p.price from Customer c join c.product p")
    @Query("update customer set name='delhi' where id=")
//    public List<Order> getJoinInformation();
public String getJoinInformation();
}
