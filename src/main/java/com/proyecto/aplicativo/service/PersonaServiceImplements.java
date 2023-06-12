package com.proyecto.aplicativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.aplicativo.entity.Persona;
import com.proyecto.aplicativo.repository.PersonaRepository;
@Service
public class PersonaServiceImplements implements PersonaService{
@Autowired

 PersonaRepository x;
	@Override
	public Persona registrar(Persona a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Persona actualizar(Persona a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Persona a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Persona> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
