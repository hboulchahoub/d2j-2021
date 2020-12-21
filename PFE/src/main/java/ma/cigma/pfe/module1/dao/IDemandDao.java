package ma.cigma.pfe.module1.dao;

import ma.cigma.pfe.module1.models.Demand;
/**
 * this interface contains signatures of methods to be called 
 * by the service layer 
 * @author Mr.BOULCHAHOUB
 * @date 21.12.2020
 */
public interface IDemandDao {
	
	boolean insert(Demand d);
	boolean update(Demand d);
	boolean delete(Demand d);
	boolean select(Demand d);
}
