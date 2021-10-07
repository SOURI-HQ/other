package com.souri.spring.springbasics.cdi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CdiBusinessTest {

    @InjectMocks
    CdiBusiness business;

    @Mock
    CdiDao daoMock;

    @Test
    public void testBasicScenerio() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2, 8});
        assertEquals(8, business.findGreatest());
    }

    @Test
    public void testBasicScenario_2() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, business.findGreatest());
    }

    @Test
    public void testBasicScenario_EqualElements() {
        Mockito.when(daoMock.getData()).thenReturn(new int[] {2, 2});
        assertEquals(2, business.findGreatest());
    }
}