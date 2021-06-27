package MarioRipoff.Util;

import javafx.scene.paint.Color;

/**
 * Just a util class which has some important but simple methods.
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 22
 */

public class ColorUtil {

    /**
     * Converts a java.awt.Color to a javafx.scene.paint.Color. this is important because javafx cant handle awt colors
     * @param color the color
     * @return the color
     */
    public static Color convertColor (java.awt.Color color){
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();
        double opacity = color.getAlpha() / 255.0;
        return javafx.scene.paint.Color.rgb(red, green, blue, opacity);
    }
}
