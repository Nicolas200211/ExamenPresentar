package com.proyecto.aplicativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.aplicativo.entity.Ingreso;
import com.proyecto.aplicativo.repository.IngresoRepository;
@Service
public class IngresoServiceImplements  implements IngresoService{
@Autowired
IngresoRepository x;
	@Override
	public Ingreso registrar(Ingreso a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Ingreso actualizar(Ingreso a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Ingreso a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Ingreso> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
