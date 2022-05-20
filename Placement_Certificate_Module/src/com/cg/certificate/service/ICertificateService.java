package com.cg.certificate.service;

import com.cg.certificate.entities.Certificate;

public interface ICertificateService {
			Certificate addCertificate(Certificate certificate);
			Certificate updateCertificate(Certificate certificate);
			Certificate searchCertificate(int id);
			Certificate deleteCertificate(int id);
			
}
