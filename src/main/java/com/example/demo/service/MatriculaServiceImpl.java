package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IMatriculaRepo;
import com.example.demo.repo.modelo.Estudiante;
import com.example.demo.repo.modelo.Matricula;
import com.example.demo.repo.modelo.MatriculaTo;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepo matriculaRepo;
	@Autowired
	private IEstudianteService estudianteService;

	@Override
	public void guardar(Matricula matricula) {
		Estudiante estu = this.estudianteService.buscarPorCedula(matricula.getEstudiante().getCedula());
		matricula.setEstudiante(estu);
		this.matriculaRepo.insertar(matricula);
	}

	@Override
	public List<MatriculaTo> buscarTodos() {
		return this.matriculaRepo.seleccionarTodos();
	}
}
