package com.eliaquim.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliaquim.helpdesk.domains.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
