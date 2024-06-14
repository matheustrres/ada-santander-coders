package main;

public class Main {
    public static void main(String[] args) {
        Button redButton = ButtonRegistry.getButton("RED_BUTTON");
        Button blueButton = ButtonRegistry.getButton("BLUE_BUTTON");
        Button yellowButton = ButtonRegistry.getButton("YELLOW_BUTTON");

        System.out.println(redButton);
        System.out.println(blueButton);
        System.out.println(yellowButton);

        yellowButton.setHeight(50);

        System.out.println(yellowButton);

        String blackButtonKey = "BLACK_BUTTON";

        Button blackButton = new Button();
        blackButton.setColor("BLACK");
        blackButton.setHeight(29);
        blackButton.setWidth(41);
        blackButton.setBorderType(BorderType.DOTTED);

        ButtonRegistry.addRegistry(blackButtonKey, blackButton);

        Button blackButtonClone = ButtonRegistry.getButton(blackButtonKey);

        System.out.println(blackButtonClone);
    }
}