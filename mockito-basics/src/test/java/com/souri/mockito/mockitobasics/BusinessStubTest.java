package com.souri.mockito.mockitobasics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BusinessStubTest {

    @Test
    public void testFindGreatestFromAllData() {
        BusinessImpl business = new BusinessImpl(new DataServiceStub());
        int result = business.findGreatestFromAllData();
        assertEquals(24, result);
    }
}

class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] {4, 6, 24, 1};
    }

}