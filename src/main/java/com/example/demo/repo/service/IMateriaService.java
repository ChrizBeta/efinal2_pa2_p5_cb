package com.example.demo.repo.service;

import com.example.demo.repo.modelo.Materia;

public interface IMateriaService {
	
	public void guardar (Materia materia);
	public Materia buscarPorCodigo (String codigo);


}
