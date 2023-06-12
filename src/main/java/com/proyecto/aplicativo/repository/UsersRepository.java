package com.proyecto.aplicativo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.aplicativo.entity.Users;

public interface UsersRepository  extends JpaRepository<Users, String>{

}
