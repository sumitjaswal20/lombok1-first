package com.example.lombok1.Controler;

import com.example.lombok1.Repository.CustomerRepo;
import com.example.lombok1.Repository.Productrepo;
import com.example.lombok1.dto.Order;
import com.example.lombok1.dto.Response;
import com.example.lombok1.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controler {
    @Autowired
    CustomerRepo customerRepo;
    @Autowired
    Productrepo productrepo;

    @RequestMapping(value = "/placeorder",method = RequestMethod.POST)
    public Customer placeorder(@RequestBody Order order)
    {
        return customerRepo.save(order.getCustomer());

    }
    @RequestMapping(value = "/findorder",method = RequestMethod.GET)
    public List<Customer> findallorder()
    {
        return customerRepo.findAll();
    }
    @RequestMapping(value = "/join",method = RequestMethod.GET)
    public String getJoinInformation()
    {
        return customerRepo.getJoinInformation();
    }
}
