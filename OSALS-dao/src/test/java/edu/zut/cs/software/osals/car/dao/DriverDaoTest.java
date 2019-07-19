package edu.zut.cs.software.osals.car.dao;

import edu.zut.cs.software.base.dao.GenericDaoTestCase;
import edu.zut.cs.software.osals.car.domain.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DriverDaoTest extends GenericDaoTestCase<Long, Driver, DriverDao> {

    private static final Logger logger = LogManager.getLogger(DriverDao.class.getName());

    @Autowired
    DriverDao driverDao;

    @Test
     public  void getAllDriver(){
        List<Driver> list =this.driverDao.findAll();
        if (logger.isInfoEnabled()) {
            logger.info("testFindAll() - List<Commodity> list={}", list); //$NON-NLS-1$
        }

     }

}
