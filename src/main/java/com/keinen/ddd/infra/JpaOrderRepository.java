package com.keinen.ddd.infra;

import com.keinen.ddd.domain.Order;
import com.keinen.ddd.domain.OrderNo;
import com.keinen.ddd.domain.OrderRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class JpaOrderRepository implements OrderRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Order findById(OrderNo id) {
        return entityManager.find(Order.class, id);
    }

    @Override
    public void save(Order order) {
        entityManager.persist(order);
    }

    @Override
    public List<Order> findByOrdererId(String ordererId, int startRow, int fecchSize) {
        TypedQuery<Order> query = entityManager.createQuery(
                "select o from Order o " +
                        "where o.orderer.memberId.id = :ordererId " +
                        "order by o.number.number desc", Order.class);
    query.setParameter("ordererId", ordererId);
    query.setFirstResult(startRow);
    query.setMaxResults(fecchSize);

    return query.getResultList();
    }

    @Override
    public void delete(Order order) {
        entityManager.remove(order);
    }
}
