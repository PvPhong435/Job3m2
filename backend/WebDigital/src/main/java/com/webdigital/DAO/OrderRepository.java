package com.webdigital.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webdigital.Model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}