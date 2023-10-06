package add;

public class Main {

    public enum TrafficLightColor {
        RED, YELLOW, GREEN
    }

    public static void main(String[] args) {
        try {
            getOutput("Дорожній світлофор:");
            for (TrafficLightColor color : TrafficLightColor.values()) {
                getOutput("  " + color + ": " + getResult(color));
                Thread.sleep(1000); // Затримка 1 секунда між кольорами
            }
        } catch (Exception e) {
            getOutput("Exception: " + e.getMessage());
        }
    }

    private static String getResult(TrafficLightColor color) {
        return switch (color) {
            case RED -> "Заборона руху";
            case YELLOW -> "Приготуватися";
            case GREEN -> "Рух дозволено.";
        };
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}