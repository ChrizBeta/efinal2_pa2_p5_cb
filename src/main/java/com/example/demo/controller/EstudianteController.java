package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

@Controller
@RequestMapping("/estudiantes")
public class EstudianteController {
	
	//http://localhost:8080/estudiantes/nuevoEstudiante

	@Autowired
	private IEstudianteService estudianteService;
	

	@GetMapping("/nuevoEstudiante")
	public String nuevoEstudiante(Model modelo) {
		modelo.addAttribute("estudiante", new Estudiante());
		return "vistaNuevoEstudiante";
	}
	
	@PostMapping("/guardarEstudiante")
	public String guardarEstudiante(Estudiante estudiante) {
		this.estudianteService.guardar(estudiante);
		return "redirect:/estudiantes/nuevoEstudiante";
	}
	
}
