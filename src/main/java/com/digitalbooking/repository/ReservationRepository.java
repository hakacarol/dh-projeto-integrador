package com.digitalbooking.repository;

import com.digitalbooking.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

//    @Query("select p from Reservation p where p.product.id = :id")
    List<Reservation> findByProductId(Integer id);

    List<Reservation> findByUserAccountId(Integer id);
}
