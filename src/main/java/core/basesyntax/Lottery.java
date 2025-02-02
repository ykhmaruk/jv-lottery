package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER_OF_BALL = 100;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Ball getRandomBall() {
        Ball ball = new Ball();
        ball.setColor(colorSupplier.getRandomColor().name());
        ball.setNumber(random.nextInt(MAX_NUMBER_OF_BALL));
        return ball;
    }
}
