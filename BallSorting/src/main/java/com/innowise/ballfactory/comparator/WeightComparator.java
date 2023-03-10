package com.innowise.ballfactory.comparator;

import com.innowise.ballfactory.ball.Ball;

import java.util.Comparator;

public class WeightComparator implements Comparator<Ball> {
    @Override
    public int compare(Ball leftBall, Ball rightBall) {
        return Integer.compare(leftBall.getWeight(), rightBall.getWeight());
    }
}
