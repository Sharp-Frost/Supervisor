package com.orange.supervision.service.impl;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

import com.orange.supervision.domaine.MemoryInformation;
import com.orange.supervision.domaine.Rapport;
import com.orange.supervision.service.Supervisor;


public class SupervisorImpl implements Supervisor {

	OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(	OperatingSystemMXBean.class);

	public Rapport getRapport(String name,int id) {
		Rapport rapport = new Rapport();
		rapport.setId(id);
		rapport.setName(name);
		return rapport;
	}

	@Override
	public Double getCpuUsage() {
		return this.osBean.getSystemLoadAverage();
	}

	@Override
	public MemoryInformation getMemoryInformation() {
		return null;
	}

}
