package com.exam.pro.final_dsw_backend.service;

import com.exam.pro.final_dsw_backend.model.Docente;
import java.util.List;
public interface DocenteService {

    Docente registrar(Docente docente);

    Docente actualizar(Docente docente);

    List<Docente> listar();

    Docente buscarPorId(Integer id);

    void eliminar(Integer id);

    List<Docente> consultarPorRangoDeSueldo(Double min, Double max);
}
