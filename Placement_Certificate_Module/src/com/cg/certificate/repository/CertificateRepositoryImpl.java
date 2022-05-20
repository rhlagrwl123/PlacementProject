package com.cg.certificate.repository;

import javax.persistence.EntityManager;

import com.cg.certificate.entities.Certificate;

public class CertificateRepositoryImpl implements ICertificateRepository {

 //Step 1 : Start JPA LifeCycle
	
	private EntityManager entityManager;

	public CertificateRepositoryImpl() {
		entityManager  = JPAUtil.getEntityManager();	
		}
	public Certificate addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		return certificate;
	}

	public Certificate updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		return certificate;
	}

	public Certificate searchCertificate(int id) {
		Certificate certificate = entityManager.find(Certificate.class, id);	
		return certificate;
	}

	public Certificate deleteCertificate(int id) {
		Certificate certificate = entityManager.find(Certificate.class, id);	
		return null;
	}
	public void beginTransaction() {
		entityManager.getTransaction().begin();		
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();		
	}

}
