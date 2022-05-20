package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Placement;

public class PlacementRepositoryImpl implements IPlacementRepository
{
	//Step 1 : Start JPA LifeCycle
	
	private EntityManager entityManager;

	public PlacementRepositoryImpl() {
		entityManager  = JPAUtil.getEntityManager();	
		}
		// create operation - repository/DAO
	public Placement addPlacement(Placement placement) {
		entityManager.persist(placement);
		return placement;
	}

	public Placement updatePlacement(Placement placement) {
		entityManager.merge(placement);
		return placement;
	}

	public Placement searchPlacement(int id) {
		Placement placement = entityManager.find(Placement.class, id);	
		return placement;
	}
	public void beginTransaction() {
		entityManager.getTransaction().begin();		
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();		
	}
	public Placement cancelPlacement(int id) {
		Placement placement = entityManager.find(Placement.class, id);
		entityManager.remove(placement);
		return placement;
	}

}
