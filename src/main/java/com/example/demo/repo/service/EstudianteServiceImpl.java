package com.example.demo.repo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IEstudianteRepo;
import com.example.demo.repo.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	
	@Autowired
	private IEstudianteRepo estudianteRepo;

	@Override
	public void guardar(Estudiante estudiante) {
		this.estudianteRepo.insertar(estudiante);
		
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		return this.estudianteRepo.seleccionarPorCedula(cedula);
	}

}
