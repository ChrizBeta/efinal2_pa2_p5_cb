package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Materia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MateriaRepoImpl implements IMateriaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Materia materia) {
		this.entityManager.persist(materia);

	}

	@Override
	public Materia seleccionarPorCodigo(String codigo) {
		TypedQuery<Materia> query = this.entityManager.createQuery("SELECT m FROM Materia m WHERE m.codigo= :codigo",
				Materia.class);
		query.setParameter("codigo", codigo);
		return query.getSingleResult();
	}

}
