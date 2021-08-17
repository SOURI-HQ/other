package com.souri.mockito.mockitobasics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BusinessMockTest {

    @Test
    public void testFindGreatestFromAllData() {
        DataService dataService = mock(DataService.class);
        when(dataService.retrieveAllData()).thenReturn(new int[] {4, 6, 24, 1});

        BusinessImpl business = new BusinessImpl(dataService);
        int result = business.findGreatestFromAllData();
        assertEquals(24, result);
    }

    @Test
    public void testFindGreatestFromAllData_forOneValue() {
        DataService dataService = mock(DataService.class);
        when(dataService.retrieveAllData()).thenReturn(new int[] {4});

        BusinessImpl business = new BusinessImpl(dataService);
        int result = business.findGreatestFromAllData();
        assertEquals(4, result);
    }
}