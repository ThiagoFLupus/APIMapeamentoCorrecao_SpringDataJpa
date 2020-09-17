package com.mapeamento.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.mapeamento.repository.TutorRepository;
import com.mapeamento.model.Tutor;
import java.util.List;

@RestController
@RequestMapping("/tutor")
public class TutorController {
	
	@Autowired
	TutorRepository tutorRepository;
	
	@GetMapping("/listar-tutores")
	public List<Tutor> listarTutor() {
		return tutorRepository.findAll();
	}
	
	//@GetMapping("/buscar-tutor-id/{id}")
	//public Tutor buscarTutorPorId(@PathVariable("id") long id) {
	//tutorRepository.findById(id);
	//}
	
	//public void salvarTutor(Tutor tutor){
		//tutorRepository.save(tutor);
	//}
}
