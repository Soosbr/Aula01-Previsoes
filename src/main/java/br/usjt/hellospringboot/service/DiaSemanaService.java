package br.usjt.hellospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.hellospringboot.model.DiaSemana;
import br.usjt.hellospringboot.repository.DiaSemanaRepository;

@Service
public class DiaSemanaService {

	@Autowired
	private DiaSemanaRepository diaRepo;
	
	public List<DiaSemana> listarTodos(){
		return diaRepo.findAll();
	}
}
