package com.proyecto.aplicativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.aplicativo.entity.Detalleventa;
import com.proyecto.aplicativo.repository.DetalleventaRepository;
@Service
public class DetalleventaServiceImplements implements DetalleventaService{
@Autowired
DetalleventaRepository x;
	@Override
	public Detalleventa registrar(Detalleventa a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Detalleventa actualizar(Detalleventa a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Detalleventa a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Detalleventa> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
