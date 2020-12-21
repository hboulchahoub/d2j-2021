package ma.cigma.pfe.module1.service;

import ma.cigma.pfe.module1.models.Demand;
/**
 * this interface contains signatures of methods to be called 
 * by the controllers (presentation layer)
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
public interface IDemandService {
	boolean insertDemand(Demand d);
	boolean updateDemand(Demand d);
	boolean deleteDemand(Demand d);
	boolean selectDemand(Demand d);
}
