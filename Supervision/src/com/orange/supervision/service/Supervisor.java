package com.orange.supervision.service;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.orange.supervision.domaine.MemoryInformation;
import com.orange.supervision.domaine.Rapport;

@WebService(endpointInterface = "com.orange.supervision.service.Supervisor")
public interface Supervisor {

	public Rapport getRapport(@WebParam(name="name") String name, @WebParam(name="id")int id);
	
	public Double getCpuUsage();
	
	public MemoryInformation getMemoryInformation();
}
