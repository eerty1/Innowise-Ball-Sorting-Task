package com.innowise.ballfactory;

import com.innowise.ballfactory.ball.Ball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.innowise.ballfactory.ball.ballproperty.Color.*;
import static com.innowise.ballfactory.ball.ballproperty.Type.*;

public class PreRunData {
    private final Ball BASKETBALL_BALL = new Ball(BASKETBALL, ORANGE, 750, 600);
    private final Ball FOOTBALL_BALL = new Ball(FOOTBALL, BROWN, 700, 400);
    private final Ball GOLF_BALL = new Ball(GOLF, WHITE, 50, 45);
    private final Ball SOCCER_BALL = new Ball(SOCCER, WHITE, 675, 450);
    private final Ball TENNIS_BALL = new Ball(TENNIS, GREEN, 60, 55);
    private final Ball VOLLEYBALL_BALL = new Ball(VOLLEYBALL, BLUE, 650, 250);

    public List<Ball> getListToSort() {
        return new ArrayList<>(Arrays.asList(GOLF_BALL, VOLLEYBALL_BALL, FOOTBALL_BALL, BASKETBALL_BALL, SOCCER_BALL, TENNIS_BALL));
    }
}
