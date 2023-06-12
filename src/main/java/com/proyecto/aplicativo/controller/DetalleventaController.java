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

import com.proyecto.aplicativo.entity.Detalleventa;
import com.proyecto.aplicativo.service.DetalleventaService;
@RestController
@RequestMapping("/ventas")
public class DetalleventaController {
@Autowired
DetalleventaService x;
	
	@PostMapping
	public Detalleventa registrar (@RequestBody Detalleventa a) {
		return x.registrar(a);
	}
	@PutMapping
	public Detalleventa actualizar   (@RequestBody Detalleventa a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody Detalleventa a) {
		x.eliminar(a);
	}
	@GetMapping 
	public List<Detalleventa> ver(){
	
		return x.ver();
}
}
