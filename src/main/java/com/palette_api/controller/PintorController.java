package com.palette_api.controller;

import com.palette_api.dto.PintorDTO;
import com.palette_api.model.PintorModel;
import com.palette_api.service.PintorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pintores")
public class PintorController {

    @Autowired
    private PintorService pintorService;

    @PostMapping
    public PintorModel criar(@RequestBody PintorDTO pintorDTO) {
        return pintorService.criar(pintorDTO);
    }

    @PutMapping("/{id}")
    public PintorModel atualizar(@PathVariable Long id, @RequestBody PintorDTO pintorDTO) {
        return pintorService.atualizar(id, pintorDTO);
    }


    @GetMapping
    public List<PintorModel> listar() {
        return pintorService.listarTodos();
    }

    @GetMapping("/{id}")
    public PintorModel buscar(@PathVariable Long id) {
        return pintorService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        pintorService.deletar(id);
    }
}
