package com.proyecto.aplicativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.aplicativo.entity.Detalleingreso;
import com.proyecto.aplicativo.repository.DetalleingresoRepository;
@Service
public class DetalleingresoServiceImplements  implements DetalleingresoService{
 @Autowired
 DetalleingresoRepository x;
	
	@Override
	public Detalleingreso registrar(Detalleingreso a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Detalleingreso actualizar(Detalleingreso a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Detalleingreso a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Detalleingreso> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
