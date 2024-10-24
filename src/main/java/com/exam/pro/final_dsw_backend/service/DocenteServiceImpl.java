package com.exam.pro.final_dsw_backend.service;

import com.exam.pro.final_dsw_backend.model.Docente;
import com.exam.pro.final_dsw_backend.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DocenteServiceImpl implements DocenteService {

    @Autowired
    private DocenteRepository docenteRepository;

    @Override
    public Docente registrar(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public Docente actualizar(Docente docente) {
        return docenteRepository.save(docente);
    }

    @Override
    public List<Docente> listar() {
        return docenteRepository.findAll();
    }

    @Override
    public Docente buscarPorId(Integer id) {
        return docenteRepository.findById(id).orElseThrow(() -> new RuntimeException("Docente no encontrado"));
    }

    @Override
    public void eliminar(Integer id) {
        docenteRepository.deleteById(id);
    }

    @Override
    public List<Docente> consultarPorRangoDeSueldo(Double min, Double max) {
        return docenteRepository.findBySueldoBetween(min, max);
    }
}
