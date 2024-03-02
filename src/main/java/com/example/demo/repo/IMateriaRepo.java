package com.example.demo.repo;

import com.example.demo.repo.modelo.Materia;

public interface IMateriaRepo {
	
	public void insertar (Materia materia);
	public Materia seleccionarPorCodigo (String codigo);

}
