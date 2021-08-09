package com.souri.spring.springbasics.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
    public int[] sort(int[] numbers) {
        // Quick Sort Logic
        return numbers;
    }
}
