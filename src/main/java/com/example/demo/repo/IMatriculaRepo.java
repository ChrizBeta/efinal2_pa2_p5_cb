package com.example.demo.repo;

import java.util.List;

import com.example.demo.repo.modelo.Matricula;
import com.example.demo.repo.modelo.MatriculaTo;

public interface IMatriculaRepo {
	
	public void insertar (Matricula matricula);
	public List<MatriculaTo> seleccionarTodos();

}
