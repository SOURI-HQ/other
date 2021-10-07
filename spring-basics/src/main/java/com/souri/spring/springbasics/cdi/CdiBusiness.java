package com.souri.spring.springbasics.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiBusiness {
    @Inject
    CdiDao cdiDao;

    public CdiDao getCdiDao() {
        return cdiDao;
    }
    public void setCdiDao(CdiDao cdiDao) {
        this.cdiDao = cdiDao;
    }

    public int findGreatest() {
        int[] numbers = cdiDao.getData();
        int greatestNumber = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > greatestNumber) {
                greatestNumber = number;
            }
        }
        return greatestNumber;
    }
}
