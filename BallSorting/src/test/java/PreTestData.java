import com.innowise.ballfactory.ball.Ball;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.innowise.ballfactory.ball.ballproperty.Color.*;
import static com.innowise.ballfactory.ball.ballproperty.Type.*;

public class PreTestData {
    private final Ball BASKETBALL_BALL = new Ball(BASKETBALL, ORANGE, 750, 600);
    private final Ball FOOTBALL_BALL = new Ball(FOOTBALL, BROWN, 700, 400);
    private final Ball GOLF_BALL = new Ball(GOLF, WHITE, 50, 45);
    private final Ball SOCCER_BALL = new Ball(SOCCER, WHITE, 675, 450);
    private final Ball TENNIS_BALL = new Ball(TENNIS, GREEN, 60, 55);
    private final Ball VOLLEYBALL_BALL = new Ball(VOLLEYBALL, BLUE, 650, 250);

    public List<Ball> getListToSort() {
        return new ArrayList<>(Arrays.asList(GOLF_BALL, VOLLEYBALL_BALL, FOOTBALL_BALL, BASKETBALL_BALL, SOCCER_BALL, TENNIS_BALL));
    }

    public List<Ball> getExpectedListSortedByType() {
        return new ArrayList<>(Arrays.asList(BASKETBALL_BALL, FOOTBALL_BALL, GOLF_BALL, SOCCER_BALL, TENNIS_BALL, VOLLEYBALL_BALL));
    }

    public List<Ball> getExpectedListSortedByColor() {
        return new ArrayList<>(Arrays.asList(GOLF_BALL, SOCCER_BALL, VOLLEYBALL_BALL, TENNIS_BALL, BASKETBALL_BALL, FOOTBALL_BALL));
    }

    public List<Ball> getExpectedListSortedBySize() {
        return new ArrayList<>(Arrays.asList(GOLF_BALL, TENNIS_BALL, VOLLEYBALL_BALL, SOCCER_BALL, FOOTBALL_BALL, BASKETBALL_BALL));
    }

    public List<Ball> getExpectedListSortedByWeight() {
        return new ArrayList<>(Arrays.asList(GOLF_BALL, TENNIS_BALL, VOLLEYBALL_BALL, FOOTBALL_BALL, SOCCER_BALL, BASKETBALL_BALL));
    }
}
