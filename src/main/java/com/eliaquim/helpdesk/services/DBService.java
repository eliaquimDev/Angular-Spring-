package com.eliaquim.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eliaquim.helpdesk.domains.Chamado;
import com.eliaquim.helpdesk.domains.Cliente;
import com.eliaquim.helpdesk.domains.Tecnico;
import com.eliaquim.helpdesk.domains.enums.Perfil;
import com.eliaquim.helpdesk.domains.enums.Prioridade;
import com.eliaquim.helpdesk.domains.enums.Status;
import com.eliaquim.helpdesk.repositories.ChamadoRepository;
import com.eliaquim.helpdesk.repositories.ClienteRepository;
import com.eliaquim.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDb() {
		Tecnico tec1 = new Tecnico(null,"Eliaquim", "83054068064", "eliaquim@gmail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Pedro", "69054077064", "pedro@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}
}
