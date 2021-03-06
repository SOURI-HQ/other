package com.souri.mockito.mockitobasics;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void testSize() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10);
        assertEquals(10, listMock.size());
        assertEquals(10, listMock.size());
    }
    @Test
    public void testSize_MultipleReturns() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, listMock.size());
        assertEquals(20, listMock.size());
        assertEquals(20, listMock.size());
    }

    @Test
    public void testGet_Specific() {
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("Returned String");
        assertEquals("Returned String", listMock.get(0));
        assertNull(listMock.get(1));
        //assertEquals(null, listMock.get(1));
    }

    @Test
    public void testGet_Generic() {
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("Returned String");
        assertEquals("Returned String", listMock.get(0));
        assertEquals("Returned String", listMock.get(1));
    }

}