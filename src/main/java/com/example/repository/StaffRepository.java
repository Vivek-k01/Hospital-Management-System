package com.example.repository;

import com.example.model.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer> {
    // JpaRepository apne aap saare basic kaam (Save, Find, Delete) kar lega.
}
