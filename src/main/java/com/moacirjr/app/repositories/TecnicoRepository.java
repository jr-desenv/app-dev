package com.moacirjr.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moacirjr.app.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
