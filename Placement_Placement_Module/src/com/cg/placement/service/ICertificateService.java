package com.cg.placement.service;

import com.cg.placement.entities.Certificate;

public interface ICertificateService {
			Certificate addCertificate(Certificate certificate);
			Certificate updateCertificate(Certificate certificate);
			Certificate searchCertificate(int id);
			Certificate deleteCertificate(int id);
			
}
