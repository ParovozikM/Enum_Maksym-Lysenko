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
