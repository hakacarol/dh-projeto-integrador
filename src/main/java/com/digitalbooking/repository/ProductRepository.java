package com.digitalbooking.repository;

import com.digitalbooking.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

//    @Query("select p from Product p where p.city.name = :name")
    List<Product> findByCityName(String name);

//    @Query("select p from Product p where p.category.title = :title")
    List<Product> findByCategoryTitle(String title);

    @Query("select p from Product p inner join p.reservations r on p.city.name = :name and (:start  between r.startDate and r.endDate or :end  between r.startDate and r.endDate or r.startDate between :start and :end) ")
    List<Product> findByCityDateAvailable(String name, Date start, Date end);

    @Query("select p from Product p inner join p.reservations r on (:start  between r.startDate and r.endDate or :end  between r.startDate and r.endDate or r.startDate between :start and :end) ")
    List<Product> findByDateAvailable(Date start, Date end);
}
