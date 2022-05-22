package com.cg.certificate.client;

import com.cg.certificate.entities.Certificate;
import com.cg.certificate.service.CertificateServiceImpl;
import com.cg.certificate.service.ICertificateService;

public class client {
	   

		public static void main(String[] args) 
		    {
			// Creating an object of all entity files
			Certificate certificate = new Certificate();
			
			certificate.setId(24233);
			certificate.setYear(2022);
			certificate.setCollege("Oriental group of Institute Bhopal");
			
			
			
			System.out.println("one certificate entry is completed");
			
			
		}

	}
	

