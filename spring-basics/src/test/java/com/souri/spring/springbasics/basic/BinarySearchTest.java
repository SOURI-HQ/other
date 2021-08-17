package com.souri.spring.springbasics.basic;

import com.souri.spring.springbasics.SpringBasicsBasicApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringBasicsBasicApplication.class)
class BinarySearchTest {
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenerio() {
        int actualResult = binarySearch.binarySearch(new int[]{}, 7);
        assertEquals(7, actualResult);
    }
}