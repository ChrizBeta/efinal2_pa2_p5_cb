package com.example.demo.repo.service;

import com.example.demo.repo.modelo.Estudiante;

public interface IEstudianteService {
	
	public void guardar(Estudiante estudiante);
	public Estudiante buscarPorCedula(String cedula);

}
