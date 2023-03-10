package com.innowise.ballfactory.sorter;

import com.innowise.ballfactory.ball.Ball;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MergeSort implements Sorter {
    @Override
    public List<Ball> sort(Comparator<Ball> comparator, List<Ball> ballsToSort) {
        mergeSort(comparator, ballsToSort);
        return ballsToSort;
    }
    private static void mergeSort(Comparator<Ball> ballComparator, List<Ball> ballsToSort) {
        int inputLength = ballsToSort.size();
        if (inputLength < 2) {
            return;
        }

        int midIndex = inputLength / 2;
        List<Ball> leftPart = new ArrayList<>(midIndex);
        List<Ball> rightPart = new ArrayList<>(inputLength - midIndex);

        for (int i = 0; i < midIndex; i++) {
            leftPart.add(ballsToSort.get(i));
        }

        for (int i = midIndex; i < inputLength; i++) {
            rightPart.add(ballsToSort.get(i));
        }

        mergeSort(ballComparator, leftPart);
        mergeSort(ballComparator, rightPart);
        merge(ballComparator, ballsToSort, leftPart, rightPart);
    }

    private static void merge(Comparator<Ball> ballComparator, List<Ball> ballsToSort, List<Ball> leftPart, List<Ball> rightPart) {
        int leftSize = leftPart.size();
        int rightSize = rightPart.size();

        int leftPartIndex = 0;
        int rightPartIndex = 0;
        int resultingIndex = 0;

        while (leftPartIndex < leftSize && rightPartIndex < rightSize) {
            if (ballComparator.compare(leftPart.get(leftPartIndex), rightPart.get(rightPartIndex)) <= 0) {
                ballsToSort.set(resultingIndex, leftPart.get(leftPartIndex));
                leftPartIndex++;
            } else {
                ballsToSort.set(resultingIndex, rightPart.get(rightPartIndex));
                rightPartIndex++;
            }
            resultingIndex++;
        }

        fillParts(ballsToSort, leftPart, leftPartIndex, resultingIndex,leftSize);
        fillParts(ballsToSort, rightPart, rightPartIndex, resultingIndex,rightSize);
    }

    private static void fillParts(List<Ball> ballsToSort, List<Ball> part, int partIndex, int inputIndex, int size) {
        while (partIndex < size) {
            ballsToSort.set(inputIndex, part.get(partIndex));
            partIndex++;
            inputIndex++;
        }
    }
}
