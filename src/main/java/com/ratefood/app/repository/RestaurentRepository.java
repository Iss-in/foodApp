package com.ratefood.app.repository;

import com.ratefood.app.entity.Restaurent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface RestaurentRepository extends JpaRepository<Restaurent, Long> {
}
