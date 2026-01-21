package core.basesyntax;

import java.util.Random;

class ColorSupplier {
    private static final Random random = new Random();

    public static Color getRandomColor() {
        Color[] colors = Color.values();
        return colors[random.nextInt(colors.length)];
    }
}
enum Color {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    ORANGE
}

