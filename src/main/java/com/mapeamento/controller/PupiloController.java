package com.mapeamento.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import com.mapeamento.repository.PupiloRepository;
import java.util.List;
import com.mapeamento.model.Pupilo;

@RestController
@RequestMapping("/pupilo")
public class PupiloController {

	@Autowired
	PupiloRepository pupiloRepository;
	
	@GetMapping("/listar-pupilos")
	public List<Pupilo> listarPupilo(){
		return pupiloRepository.findAll();
	}
	
	//public Pupilo buscarPupiloPorId(Long id){}
	
	//public void salvarPupilo(Pupilo pupilo){}
}
