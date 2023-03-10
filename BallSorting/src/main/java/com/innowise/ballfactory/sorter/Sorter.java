package com.innowise.ballfactory.sorter;

import com.innowise.ballfactory.ball.Ball;

import java.util.Comparator;
import java.util.List;

public interface Sorter {
    List<Ball> sort(Comparator<Ball> comparator, List<Ball> ballsToSort);
}
