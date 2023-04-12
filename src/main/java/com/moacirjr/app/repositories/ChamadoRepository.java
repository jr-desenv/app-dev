package com.moacirjr.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moacirjr.app.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
