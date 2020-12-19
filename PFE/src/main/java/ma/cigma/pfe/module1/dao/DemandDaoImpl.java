package ma.cigma.pfe.module1.dao;

import ma.cigma.pfe.module1.models.Demand;


public class DemandDaoImpl implements IDemandDao{

	@Override
	public boolean insert(Demand d) {
		System.out.println("SQL REQUEST : INSERT INTO.... : "+d);
		return false;
	}

}
