package MarioRipoff.View;

import MarioRipoff.Model.RenderMap;
import MarioRipoff.Util.ColorUtil;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 * This class renders the renderMap.
 * //TODO optimize this class
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */
public class BasicRenderer extends Canvas {

    private GraphicsContext context = getGraphicsContext2D();
    private RenderMap renderMap;
    private int pixelSize;

    /**
     * Instantiates a new Basic renderer.
     * @param renderMap the render map
     * @param pixelSize the pixel size
     */
    public BasicRenderer(RenderMap renderMap, int pixelSize){
        this.renderMap = renderMap;
        this.pixelSize = pixelSize;

        setHeight(pixelSize * renderMap.getHeight() * 16);
        setWidth(pixelSize * renderMap.getWidth() * 16);

        draw();
    }

    /**
     * Draw.
     */
    public void draw() {
        context.clearRect(0,0,getWidth(), getHeight());
        int height = renderMap.getHeight();
        int width = renderMap.getWidth();

        for (int yBlock = 0; yBlock < height; yBlock++) {
            for (int xBlock = 0; xBlock < width; xBlock++) {
                for (int yPixel = 0; yPixel < 16; yPixel++) {
                    for (int xPixel = 0; xPixel < 16; xPixel++) {
                        context.setFill(ColorUtil.convertColor(renderMap.getBlockPixel(yBlock, xBlock, yPixel, xPixel)));
                        context.fillRect((xBlock * 16 * pixelSize) + (xPixel * pixelSize), (yBlock * 16 * pixelSize) + (yPixel * pixelSize), pixelSize, pixelSize);
                    }
                }
            }
        }
        context.save();
    }
}
