package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Estudiante estudiante) {
		this.entityManager.persist(estudiante);
		
	}

	@Override
	public Estudiante seleccionarPorCedula(String cedula) {
		TypedQuery<Estudiante> query=this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.cedula = :cedula", Estudiante.class);
		query.setParameter("cedula", cedula);
		return query.getSingleResult();
	}

}
