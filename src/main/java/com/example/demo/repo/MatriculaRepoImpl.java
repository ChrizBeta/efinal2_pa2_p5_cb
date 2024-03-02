package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Matricula;
import com.example.demo.repo.modelo.MatriculaTo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Matricula matricula) {
		this.entityManager.persist(matricula);
		
	}

	@Override
	public List<MatriculaTo> seleccionarTodos() {
		TypedQuery<MatriculaTo> query=this.entityManager.createQuery("SELECT NEW com.example.demo.repo.modelo.MatriculaTo(m.estudiante.cedula, m.materia.codigo, m.fecha, m.nombreHilo) m FROM Matricula m",MatriculaTo.class);
		return query.getResultList();
	}

}
