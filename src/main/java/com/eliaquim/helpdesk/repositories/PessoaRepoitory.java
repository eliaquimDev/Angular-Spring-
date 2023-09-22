package com.eliaquim.helpdesk.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliaquim.helpdesk.domains.Pessoa;
import java.util.List;



public interface PessoaRepoitory extends JpaRepository<Pessoa, Integer>{
	 Optional<Pessoa> findByCpf(String cpf);
	 Optional<Pessoa> findByEmail(String email);
}
