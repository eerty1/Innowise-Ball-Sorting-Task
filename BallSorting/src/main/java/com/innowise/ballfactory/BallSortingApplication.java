package com.innowise.ballfactory;

import com.innowise.ballfactory.comparator.WeightComparator;
import com.innowise.ballfactory.sorter.MergeSort;
import com.innowise.ballfactory.sorter.Sorter;

public class BallSortingApplication {
    private static final Sorter sorter = new MergeSort();
    private static final PreRunData preRunData = new PreRunData();
    public static void main(String[] args) {
        System.out.println("Not sorted balls: " + "\n" + preRunData.getListToSort());
        System.out.println("========================================================");
        System.out.println("Sorted balls: " + "\n" + sorter.sort(new WeightComparator(), preRunData.getListToSort()));
    }
}