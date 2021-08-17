package com.souri.mockito.mockitobasics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class BusinessMockAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    BusinessImpl business;

    @Test
    public void testFindGreatestFromAllData() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {4, 6, 24, 1});
        assertEquals(24, business.findGreatestFromAllData());
    }

    @Test
    public void testFindGreatestFromAllData_forOneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {4});
        assertEquals(4, business.findGreatestFromAllData());
    }

    @Test
    public void testFindGreatestFromAllData_NoValues() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {4});
        assertEquals(Integer.MIN_VALUE, business.findGreatestFromAllData());
    }
}