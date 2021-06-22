package MarioRipoff.Model.Blocks;

import java.awt.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 17
 */

public abstract class Block {

    protected char blockShort;
    protected String blockName;
    protected Color[][] blockMap;

    public char getBlockShort() {
        return blockShort;
    }

    public void setBlockShort(char blockShort) {
        this.blockShort = blockShort;
    }

    public String getBlockName() {
        return blockName;
    }

    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    public Color[][] getBlockMap() {
        return blockMap;
    }

    public void setBlockMap(Color[][] blockMap) {
        this.blockMap = blockMap;
    }

    public Color getPixelColor(int yPixel, int xPixel){
        if (yPixel >= 0 && yPixel < 16 && xPixel >= 0 && xPixel < 16){
            return blockMap[yPixel][xPixel];
        } else {
            System.err.println("Invalid pixel position");
            System.err.println("Pixel Y: " + yPixel + ", X: " + xPixel);
            return null;
        }
    }
}