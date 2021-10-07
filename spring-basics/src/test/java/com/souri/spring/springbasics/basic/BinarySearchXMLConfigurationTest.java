package com.souri.spring.springbasics.basic;

import com.souri.spring.springbasics.SpringBasicsBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "/applicationContext.xml")
class BinarySearchXMLConfigurationTest {
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenerio() {
        int actualResult = binarySearch.binarySearch(new int[]{}, 7);
        assertEquals(7, actualResult);
    }
}