package com.eliaquim.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliaquim.helpdesk.domains.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
