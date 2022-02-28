package com.example.SpringbootDineshKrishnan.api;

import com.example.SpringbootDineshKrishnan.model.Customer;
import com.example.SpringbootDineshKrishnan.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
//@RequestMapping("/customers")
public class CustomerResource {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.addCustomer(customer);

    }

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("customers/{customerId}")
    public Customer getCustomer(@PathVariable("customerId") int customerId) {
        return customerService.getCustomer(customerId);
    }

    @PutMapping("customers/{customerId}")
    public Customer updateCustomer(@PathVariable("customerId") int customerId, @RequestBody Customer customer) {
        return customerService.updateCustomer(customerId, customer);
    }

    @DeleteMapping("delete/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") int customerId) {
        customerService.deleteCustomer(customerId);
    }

}
