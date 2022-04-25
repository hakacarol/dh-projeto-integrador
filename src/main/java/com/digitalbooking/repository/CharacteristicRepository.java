package com.digitalbooking.repository;

import com.digitalbooking.model.Characteristic;
import com.digitalbooking.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacteristicRepository extends JpaRepository<Characteristic, Integer> {
}
