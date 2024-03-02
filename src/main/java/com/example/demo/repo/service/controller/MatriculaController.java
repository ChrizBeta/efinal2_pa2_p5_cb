package com.example.demo.repo.service.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repo.modelo.Estudiante;
import com.example.demo.repo.modelo.Materia;
import com.example.demo.repo.modelo.Matricula;
import com.example.demo.repo.modelo.MatriculaTo;
import com.example.demo.repo.service.IEstudianteService;
import com.example.demo.repo.service.IMateriaService;
import com.example.demo.repo.service.IMatriculaService;

@Controller
@RequestMapping("/matriculas")
public class MatriculaController {

	@Autowired
	private IEstudianteService estudianteService;
	@Autowired
	private IMateriaService materiaService;
	@Autowired
	private IMatriculaService matriculaService;

	// http://localhost:8080/matriculas/nuevaMatricula
	

	@GetMapping("/nuevaMatricula")
	private String nuevaMatricula(MatriculaTo matriculaTo) {
		return "vistaNuevaMatricula";
	}

	@PostMapping("guardarMatricula")
	public String guardarMatricula(MatriculaTo matriculaTo) {
		Estudiante estu = this.estudianteService.buscarPorCedula(matriculaTo.getCedula());
		Materia mate1 = this.materiaService.buscarPorCodigo(matriculaTo.getMate1());
		Materia mate2 = this.materiaService.buscarPorCodigo(matriculaTo.getMate2());
		Materia mate3 = this.materiaService.buscarPorCodigo(matriculaTo.getMate3());
		Materia mate4 = this.materiaService.buscarPorCodigo(matriculaTo.getMate4());
		List<Materia> materias = new ArrayList<>();
		materias.add(mate1);
		materias.add(mate2);
		materias.add(mate3);
		materias.add(mate4);

		for (Materia mate : materias) {
			Matricula matricula = new Matricula();
			matricula.setEstudiante(estu);
			matricula.setMateria(mate);
			matricula.setFecha(LocalDate.now());
			matricula.setNombreHilo(Thread.currentThread().getName());
			this.matriculaService.guardar(matricula);
		}
		return "redirect:/matriculas/nuevaMatricula";
	}

	// http://localhost:8080/matriculas/listaMatricula
	
	@GetMapping("/listaMatricula")
	public String listaMatricula(Model modelo) {
		List<MatriculaTo> matriculas = this.matriculaService.buscarTodos();
		modelo.addAttribute("matriculas", matriculas);
		return "vistaListaMatricula";
	}

}
