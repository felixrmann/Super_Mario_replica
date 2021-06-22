package MarioRipoff.View;

import MarioRipoff.Model.RenderMap;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */

public class BasicRenderer extends Canvas {

    private GraphicsContext context = getGraphicsContext2D();
    private RenderMap renderMap;
    private int pixelSize;

    public BasicRenderer(RenderMap renderMap, int pixelSize){
        this.renderMap = renderMap;
        this.pixelSize = pixelSize;
    }

    public void draw() {
        context.clearRect(0,0,getWidth(), getHeight());
        for (int y = 0; y < renderMap.getHeight(); y++) {
            for (int x = 0; x < renderMap.getWidth(); x++) {
                //context.setFill(LifeColors.getRgb(displayGrid[y][x].getState()));
                context.fillRect(x * pixelSize, y * pixelSize, pixelSize, pixelSize);
            }
        }
    }

}
