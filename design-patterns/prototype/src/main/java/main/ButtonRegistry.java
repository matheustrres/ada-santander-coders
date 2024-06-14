package main;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ButtonRegistry {
    private static ButtonRegistry INSTANCE;
    private static Map<String, Button> REGISTRY = new HashMap<>();

    public static ButtonRegistry getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new ButtonRegistry();

            return INSTANCE;
        }

        return INSTANCE;
    }

    static {
        Button yellowButton = new Button();
        yellowButton.setColor("YELLOW");
        yellowButton.setHeight(14);
        yellowButton.setWidth(87);
        yellowButton.setBorderType(BorderType.DOTTED);

        Button redButton = new Button();
        redButton.setColor("RED");
        redButton.setHeight(30);
        redButton.setWidth(100);
        redButton.setBorderType(BorderType.THICK);

        Button blueButton = new Button();
        blueButton.setColor("BLUE");
        blueButton.setHeight(30);
        blueButton.setWidth(100);
        blueButton.setBorderType(BorderType.THIN);

        REGISTRY.put("YELLOW_BUTTON", yellowButton);
        REGISTRY.put("RED_BUTTON", redButton);
        REGISTRY.put("BLUE_BUTTON", blueButton);
    }

    public static Button getButton(String key) {
        return ButtonFactory.getInstance(REGISTRY.get(key));
    }

    public static void addRegistry(String key, Button button) {
        REGISTRY.put(key, button);
    }
}
