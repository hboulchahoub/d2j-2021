package ma.cigma.pfe.module1.service;

import java.util.List;

import ma.cigma.pfe.module1.models.Demand;
/**
 * this interface contains signatures of methods to be called 
 * by the controllers (presentation layer)
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
public interface IDemandService {
	Demand insertDemand(Demand d);
	Demand updateDemand(Demand d);
	void deleteDemand(Demand d);
	public Demand selectDemandById(int id);
	public List<Demand> selectAll();

}
