package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.model.Emergency;

@Repository
public interface EmergencyRepository extends JpaRepository<Emergency, Integer> {

}
