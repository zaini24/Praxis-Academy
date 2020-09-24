package com.example.banksampah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import com.example.banksampah.model.JenisSampah;

@Repository
public interface JenisSampahRepository extends JpaRepository<JenisSampah, Long> {
   
  
}