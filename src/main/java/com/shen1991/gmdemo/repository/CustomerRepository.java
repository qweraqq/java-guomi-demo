package com.shen1991.gmdemo.repository;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import com.shen1991.gmdemo.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}