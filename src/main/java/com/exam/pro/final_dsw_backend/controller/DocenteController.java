package com.exam.pro.final_dsw_backend.controller;

import com.exam.pro.final_dsw_backend.dto.DocenteDTO;
import com.exam.pro.final_dsw_backend.model.Docente;
import com.exam.pro.final_dsw_backend.service.DocenteService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/api/docentes")
public class DocenteController {

    @Autowired
    private DocenteService docenteService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<DocenteDTO> registrarDocente(@RequestBody DocenteDTO docenteDTO) {
        Docente docente = modelMapper.map(docenteDTO, Docente.class);
        docente = docenteService.registrar(docente);
        return new ResponseEntity<>(modelMapper.map(docente, DocenteDTO.class), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DocenteDTO> actualizarDocente(@PathVariable Integer id, @RequestBody DocenteDTO docenteDTO) {
        Docente docente = modelMapper.map(docenteDTO, Docente.class);
        docente.setIddocente(id);
        docente = docenteService.actualizar(docente);
        return new ResponseEntity<>(modelMapper.map(docente, DocenteDTO.class), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<DocenteDTO>> listarDocentes() {
        List<DocenteDTO> docentes = docenteService.listar().stream()
                .map(docente -> modelMapper.map(docente, DocenteDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(docentes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DocenteDTO> buscarDocente(@PathVariable Integer id) {
        Docente docente = docenteService.buscarPorId(id);
        return new ResponseEntity<>(modelMapper.map(docente, DocenteDTO.class), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarDocente(@PathVariable Integer id) {
        docenteService.eliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/sueldo")
    public ResponseEntity<List<DocenteDTO>> consultarPorRangoDeSueldo(@RequestParam Double min, @RequestParam Double max) {
        List<DocenteDTO> docentes = docenteService.consultarPorRangoDeSueldo(min, max).stream()
                .map(docente -> modelMapper.map(docente, DocenteDTO.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(docentes, HttpStatus.OK);
    }
}

