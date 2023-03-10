package com.demo.todolist.dao.impl.base;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BaseEntityManager {
    private EntityManager em;

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

	public <T> void detach(T data) {
		em.detach(data);
	}
}
