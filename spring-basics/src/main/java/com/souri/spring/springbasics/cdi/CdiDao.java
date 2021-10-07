package com.souri.spring.springbasics.cdi;

import javax.inject.Named;

@Named
public class CdiDao {

    public int[] getData() {
        return new int[] {5, 44, 7, 10};
    }
}
