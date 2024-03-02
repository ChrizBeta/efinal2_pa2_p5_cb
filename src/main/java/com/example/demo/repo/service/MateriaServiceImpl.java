package com.example.demo.repo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IMateriaRepo;
import com.example.demo.repo.modelo.Materia;

@Service
public class MateriaServiceImpl implements IMateriaService{

	
	@Autowired
	private IMateriaRepo materiaRepo;

	@Override
	public void guardar(Materia materia) {
		this.materiaRepo.insertar(materia);
		
	}

	@Override
	public Materia buscarPorCodigo(String codigo) {
		return this.materiaRepo.seleccionarPorCodigo(codigo);
	}
}
