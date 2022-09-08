package com.example.demo.repository;

import com.example.demo.model.OrderDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<OrderDTO, Integer> {
}
