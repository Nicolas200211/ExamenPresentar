package com.proyecto.aplicativo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.aplicativo.entity.Users;
import com.proyecto.aplicativo.service.UsersService;
@RestController
public class UsersController {
@Autowired
UsersService t;

@PostMapping("/users")
public Users  registrar (@RequestBody Users a) {
	return t.registrar(a);
}
@PutMapping("/users")
public Users actualizar (@RequestBody Users a) {
	return t.actualizar(a);
}
@DeleteMapping("/users")
public void eliminar(@RequestBody Users a) {
	  t.eliminar(a);

}
@GetMapping ("/users")
public List<Users>ver(){
return t.ver();
}
}