package com.Ishaan.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearch(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public  int search(int x[], int y){
        int[] sortnumbers = sortAlgorithm.sort(x);
        System.out.println(sortAlgorithm);

        return 3;
    }


}
