package com.exam.pro.final_dsw_backend.repository;

import com.exam.pro.final_dsw_backend.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
public interface DocenteRepository extends JpaRepository<Docente, Integer> {
    List<Docente> findBySueldoBetween(Double min, Double max);
}
