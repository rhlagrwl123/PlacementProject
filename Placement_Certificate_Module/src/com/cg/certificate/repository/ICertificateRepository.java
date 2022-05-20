package com.cg.certificate.repository;

import com.cg.certificate.entities.Certificate;

interface ICertificateRepository {
	Certificate addCertificate(Certificate certificate);
	Certificate updateCertificate(Certificate certificate);
	Certificate searchCertificate(int id);
	Certificate deleteCertificate(int id);
	void beginTransaction();
	void commitTransaction();
}
