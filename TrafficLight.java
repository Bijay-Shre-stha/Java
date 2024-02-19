public class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String initialColor, int initialDuration) {
        color = initialColor;
        duration = initialDuration;
    }

    public void changeColor(String newColor, int newDuration) {
        color = newColor;
        duration = newDuration;
    }

    public String getColor() {
        return color;
    }

    public boolean isRed() {
        return color.equalsIgnoreCase("red");
    }

    public boolean isGreen() {
        return color.equalsIgnoreCase("green");
    }

    public int getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 60);
        
        System.out.println("Current light color: " + trafficLight.getColor());
        System.out.println("Current light duration: " + trafficLight.getDuration());
        System.out.println("Is it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());
        
        trafficLight.changeColor("green", 45);
        System.out.println("\nAfter changing color...");
        System.out.println("Current light color: " + trafficLight.getColor());
        System.out.println("Current light duration: " + trafficLight.getDuration());
        System.out.println("Is it red? " + trafficLight.isRed());
        System.out.println("Is it green? " + trafficLight.isGreen());
    }
}
