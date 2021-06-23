package MarioRipoff.Util;

import javafx.scene.paint.Color;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 22
 */

public class ColorUtil {

    public static Color convertColor (java.awt.Color color){
        int red = color.getRed();
        int green = color.getGreen();
        int blue = color.getBlue();
        double opacity = color.getAlpha() / 255.0;
        return javafx.scene.paint.Color.rgb(red, green, blue, opacity);
    }

}
