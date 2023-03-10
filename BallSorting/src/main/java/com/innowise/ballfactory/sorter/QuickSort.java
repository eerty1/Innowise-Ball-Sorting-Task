package com.innowise.ballfactory.sorter;

import com.innowise.ballfactory.ball.Ball;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class QuickSort implements Sorter {
    @Override
    public List<Ball> sort(Comparator<Ball> comparator, List<Ball> ballsToSort) {
        quickSort(comparator, ballsToSort, 0, ballsToSort.size() - 1);
        return ballsToSort;
    }

    private static void quickSort(Comparator<Ball> ballComparator, List<Ball> ballsToSort, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        Ball pivot = ballsToSort.get(pivotIndex);
        Collections.swap(ballsToSort, pivotIndex, highIndex);
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (ballComparator.compare(ballsToSort.get(leftPointer), pivot) <= 0 && leftPointer < rightPointer) {
                leftPointer++;
            }

            while (ballComparator.compare(ballsToSort.get(rightPointer), pivot) >= 0 && leftPointer < rightPointer) {
                rightPointer--;
            }

            Collections.swap(ballsToSort, leftPointer, rightPointer);
        }

        Collections.swap(ballsToSort, leftPointer, highIndex);
        quickSort(ballComparator, ballsToSort, lowIndex, leftPointer - 1);
        quickSort(ballComparator, ballsToSort, leftPointer + 1, highIndex);
    }
}
