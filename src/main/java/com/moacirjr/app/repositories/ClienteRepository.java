package com.moacirjr.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moacirjr.app.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
