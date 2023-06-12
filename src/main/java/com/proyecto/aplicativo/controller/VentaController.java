package com.proyecto.aplicativo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.proyecto.aplicativo.entity.Venta;
import com.proyecto.aplicativo.service.VentaService;

@RestController
public class VentaController {
	@Autowired
  VentaService y;
	
	@PostMapping("/venta")
	public Venta registrar (@RequestBody Venta a) {
		return y.registrar(a);
	}
	@PutMapping("/venta")
	public Venta actualizar   (@RequestBody Venta a) {
		return y.actualizar(a);
}
	@DeleteMapping("/venta")
	public void eleminar (@RequestBody Venta a) {
		y.eliminar(a);
	}
	@GetMapping("/venta")
	public List<Venta> ver(){
	
		return y.ver();
}
}
