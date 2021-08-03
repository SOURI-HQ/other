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
}
