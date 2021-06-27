package MarioRipoff.Model.Blocks;

import java.awt.*;

/**
 * The type Block.
 *
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 17
 */
public abstract class Block {

    protected char blockShort;
    protected String blockName;
    protected Color[][] blockMap;

    /**
     * Gets block short.
     * @return the block short
     */
    public char getBlockShort() {
        return blockShort;
    }

    /**
     * Sets block short.
     * @param blockShort the block short
     */
    public void setBlockShort(char blockShort) {
        this.blockShort = blockShort;
    }

    /**
     * Gets block name.
     * @return the block name
     */
    public String getBlockName() {
        return blockName;
    }

    /**
     * Sets block name.
     * @param blockName the block name
     */
    public void setBlockName(String blockName) {
        this.blockName = blockName;
    }

    /**
     * Get block map color [ ] [ ].
     * @return the color [ ] [ ]
     */
    public Color[][] getBlockMap() {
        return blockMap;
    }

    /**
     * Sets block map.
     * @param blockMap the block map
     */
    public void setBlockMap(Color[][] blockMap) {
        this.blockMap = blockMap;
    }

    /**
     * Get pixel color color.
     * @param yPixel the y pixel
     * @param xPixel the x pixel
     * @return the color
     */
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