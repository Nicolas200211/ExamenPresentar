package com.proyecto.aplicativo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.aplicativo.entity.Users;
import com.proyecto.aplicativo.repository.UsersRepository;
@Service
public class UsersServiceImplements  implements  UsersService{
@Autowired
 UsersRepository o;
	@Override
	public Users registrar(Users a) {
		// TODO Auto-generated method stub
		return o.save(a);
	}

	@Override
	public Users actualizar(Users a) {
		// TODO Auto-generated method stub
		return o.save(a);
	}

	@Override
	public void eliminar(Users a) {
		// TODO Auto-generated method stub
		o.delete(a);
	}

	@Override
	public List<Users> ver() {
		// TODO Auto-generated method stub
		return o.findAll();
	}

}
