package com.example.demo.repo.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repo.modelo.Materia;
import com.example.demo.repo.service.IMateriaService;

@Controller
@RequestMapping("/materias")
public class MateriaController {
	
	//http://localhost:8080/materias/nuevaMateria
	
	@Autowired
	private IMateriaService materiaService;
	
	@GetMapping("/nuevaMateria")
	public String nuevaMateria (Model modelo) {
		modelo.addAttribute("materia", new Materia());
		return "vistaNuevaMateria";
	}
	
	@PostMapping("/guardarMateria")
	public String guardarMateria (Materia materia) {
		this.materiaService.guardar(materia);
		return "redirect:/materias/nuevaMateria";
	}

}
