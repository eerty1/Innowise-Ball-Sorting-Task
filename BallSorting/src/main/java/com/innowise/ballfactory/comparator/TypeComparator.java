package com.innowise.ballfactory.comparator;

import com.innowise.ballfactory.ball.Ball;

import java.util.Comparator;

public class TypeComparator implements Comparator<Ball> {
    @Override
    public int compare(Ball left, Ball right) {
        return Integer.compare(left.getType().ordinal(), right.getType().ordinal());
    }
}
