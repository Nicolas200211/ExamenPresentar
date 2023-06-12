package com.proyecto.aplicativo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.aplicativo.entity.Categoria;
import com.proyecto.aplicativo.service.CategoriaService;
@RestController
@RequestMapping("/cate")
public class CategoriaController {
@Autowired
CategoriaService x;
	
	@PostMapping
	public Categoria registrar (@RequestBody Categoria a) {
		return x.registrar(a);
	}
	@PutMapping
	public Categoria actualizar   (@RequestBody Categoria a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Categoria a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Categoria> ver(){
	
		return x.ver();
}
}
