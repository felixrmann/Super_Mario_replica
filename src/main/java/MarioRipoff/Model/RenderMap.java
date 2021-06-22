package MarioRipoff.Model;

import java.awt.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */

public class RenderMap {

    private Color[][] colorMap;

    public RenderMap(int width, int height){
        colorMap = new Color[height][width];
    }

    public Color[][] getColorMap() {
        return colorMap;
    }

    public void setColorMap(Color[][] colorMap) {
        this.colorMap = colorMap;
    }

    public int getHeight(){
        return colorMap.length;
    }

    public int getWidth(){
        return colorMap[0].length;
    }
    
    public void loadMapFromBlockMap(BlockMap blockMap){

    }

    public void setColorPixel(int y, int x, Color color){
        if (y - 1 <= colorMap.length && x - 1 <= colorMap[0].length){
            colorMap[y - 1][x - 1] = color;
        } else {
            System.err.println("Invalid pixel position");
            System.err.println("Pixel Y: " + y + ", X: " + x);
        }
    }

    public Color getColorPixel(int y, int x){
        if (y - 1 <= colorMap.length && x - 1 <= colorMap[0].length){
            return colorMap[y][x];
        } else {
            System.err.println("Invalid pixel position");
            System.err.println("Pixel Y: " + y + ", X: " + x);
            return null;
        }
    }
}
