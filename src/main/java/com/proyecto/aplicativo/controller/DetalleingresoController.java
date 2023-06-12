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

import com.proyecto.aplicativo.entity.Detalleingreso;
import com.proyecto.aplicativo.service.DetalleingresoService;
@RestController
@RequestMapping("/detalles")
public class DetalleingresoController {
@Autowired
DetalleingresoService x;
	
	@PostMapping
	public Detalleingreso registrar (@RequestBody Detalleingreso a) {
		return x.registrar(a);
	}
	@PutMapping
	public Detalleingreso actualizar   (@RequestBody Detalleingreso a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eliminar (@RequestBody Detalleingreso a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<Detalleingreso> ver(){
	
		return x.ver();
}
}