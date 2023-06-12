package com.proyecto.aplicativo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.aplicativo.entity.Ingreso;
import com.proyecto.aplicativo.service.IngresoService;
@RestController
public class IngresoController {
@Autowired
IngresoService i;
	
	@PostMapping("/ingreso")
	public Ingreso registrar (@RequestBody Ingreso a) {
		return i.registrar(a);
	}
	@PutMapping("/ingreso")
	public Ingreso actualizar   (@RequestBody Ingreso a) {
		return i.actualizar(a);
}
	@DeleteMapping("/ingreso")
	public void eleminar (@RequestBody Ingreso a) {
		i.eliminar(a);
	}
	@GetMapping("/ingreso")
	public List<Ingreso> ver(){
	
		return i.ver();
}
}
