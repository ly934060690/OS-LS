package edu.zut.cs.software.osals.expresscar.service;

import edu.zut.cs.software.base.service.GenericManager;
import edu.zut.cs.software.osals.expresscar.domain.Enwrap;
import edu.zut.cs.software.osals.expresscar.domain.ExpressCar;

import java.util.List;

/**
 * @Author: hyh
 * @Description: Enwrap Manager
 * @Date:Created in 21:12 2019/5/16
 * @Modified By:
 */
public interface EnwrapManager extends GenericManager<Enwrap, Long> {//和这个保持

    List<ExpressCar> findExpressCarByName(String name);

    List<Enwrap> matchWithName(String name);

}
