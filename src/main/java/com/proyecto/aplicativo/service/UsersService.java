package com.proyecto.aplicativo.service;

import java.util.List;

import com.proyecto.aplicativo.entity.Users;

public interface UsersService {
 public Users registrar(Users a);
 public Users actualizar(Users a);
 public void eliminar (Users a);
 public List<Users>ver();
}
