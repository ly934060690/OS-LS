package edu.zut.cs.software.osals.shop.service;

import edu.zut.cs.software.base.service.GenericManager;
import edu.zut.cs.software.osals.shop.domain.Commodity;

import java.util.List;

/**
 *
 * @author 研哥哥
 *
 */
public interface CommodityManager extends GenericManager<Commodity, Long> {

	List<Commodity> findAll();

	List<Commodity> findByCode(String code);

	List<Commodity> findByName(String name);

	/**
	 * 提供商品价格区间，find符合条件的Commdity存入List中return
	 */
	List<Commodity> findByPrice(String minPrice, String maxPrice);

}
