package edu.zut.cs.software.OSALS.goods.service;

import edu.zut.cs.software.OSALS.Goods.daomain.Goods;
import edu.zut.cs.software.OSALS.commodity.domain.Commodity;
import edu.zut.cs.software.base.service.GenericManager;

import java.util.List;

/**
 * @Auther: LBW
 * @Date: 2019/5/16
 * @Description: edu.zut.cs.software.OSALS.goods.service
 * @version: 1.0
 */
public interface GoodsManager extends GenericManager<Goods, Long> {


    List<Goods> findAll();

    Goods findByGoodNames(String GoodNames);

}