package com.sece.student.repository;

import com.sece.student.entity.Studententity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Studententity, Integer> {
}