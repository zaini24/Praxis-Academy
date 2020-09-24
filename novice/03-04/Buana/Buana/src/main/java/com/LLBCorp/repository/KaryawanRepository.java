package com.LLBCorp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import com.LLBCorp.model.Karyawan;

@Repository
public interface KaryawanRepository extends JpaRepository<Karyawan, Long> {
   
  
}