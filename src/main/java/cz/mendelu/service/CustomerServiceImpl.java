package cz.mendelu.service;

import cz.mendelu.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService{
    @Override
    public List<Customer> findAll() {
        return List.of(new Customer.Builder(1,"Joe","doe").email("john.doe@mendelu.cz").build());
    }

    @Override
    public void save(Customer customer) {

    }
}