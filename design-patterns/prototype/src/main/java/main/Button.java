package main;

public class Button {
    private String color;
    private int height;
    private int width;
    private BorderType borderType;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public BorderType getBorderType() {
        return borderType;
    }

    public void setBorderType(BorderType borderType) {
        this.borderType = borderType;
    }

    @Override
    public String toString() {
        return "Button{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", width=" + width +
                ", borderType=" + borderType +
                '}';
    }
}
