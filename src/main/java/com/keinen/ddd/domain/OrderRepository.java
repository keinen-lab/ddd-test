package com.keinen.ddd.domain;

import java.util.List;

public interface OrderRepository {
    public Order findById(OrderNo no);
    public void save(Order order);
    public List<Order> findByOrdererId(String ordererId, int startRow, int size);
  public void delete(Order order);
}
