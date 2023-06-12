package com.proyecto.aplicativo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.aplicativo.entity.Persona;

import com.proyecto.aplicativo.service.PersonaService;
@RestController
public class PersonaController {
	@Autowired
PersonaService z;
	
	@PostMapping("/persona")
	public Persona registrar (@RequestBody Persona a) {
		return z.registrar(a);
	}
	@PutMapping("/persona")
	public Persona actualizar   (@RequestBody Persona a) {
		return z.actualizar(a);
}
	@DeleteMapping("/persona")
	public void eleminar (@RequestBody Persona a) {
		z.eliminar(a);
	}
	@GetMapping("/persona")
	public List<Persona> ver(){
	
		return z.ver();
}
}
