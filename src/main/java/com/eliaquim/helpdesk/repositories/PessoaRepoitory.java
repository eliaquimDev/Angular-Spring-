package com.eliaquim.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliaquim.helpdesk.domains.Pessoa;

public interface PessoaRepoitory extends JpaRepository<Pessoa, Integer>{

}
