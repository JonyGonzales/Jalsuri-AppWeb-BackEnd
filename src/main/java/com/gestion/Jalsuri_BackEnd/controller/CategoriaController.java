package com.gestion.Jalsuri_BackEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.Jalsuri_BackEnd.model.Categoria;
import com.gestion.Jalsuri_BackEnd.repository.CategoriaRepository;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4200")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repositorio;
	
	@GetMapping("/categorias")
	public List<Categoria> listar(){
		return repositorio.findAll();
	}
	
	//Metodo para agregar Registros 
	@PostMapping("/categorias")
	public Categoria addCategoria(@RequestBody Categoria categoria) {
		return repositorio.save(categoria);
	}
}
