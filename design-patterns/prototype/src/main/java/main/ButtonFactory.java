package main;

public class ButtonFactory {
    public static Button getInstance(Button prototype) {
        Button clone = new Button();
        clone.setBorderType(prototype.getBorderType());
        clone.setColor(prototype.getColor());
        clone.setWidth(prototype.getWidth());
        clone.setHeight(prototype.getHeight());

        return clone;
    }
}
