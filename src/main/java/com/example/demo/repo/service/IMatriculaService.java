package com.example.demo.repo.service;

import java.util.List;

import com.example.demo.repo.modelo.Matricula;
import com.example.demo.repo.modelo.MatriculaTo;

public interface IMatriculaService {

	public void guardar(Matricula matricula);
	public List<MatriculaTo> buscarTodos();
	
	
}
