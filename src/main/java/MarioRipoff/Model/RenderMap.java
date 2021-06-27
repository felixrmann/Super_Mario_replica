package MarioRipoff.Model;

import MarioRipoff.Model.Blocks.VarBlock;
import MarioRipoff.Util.BlockUtil;

import java.awt.*;

/**
 * This class calculates and renders the renderMap. this Map is calculated depending of the position of the player. This
 * map then gets rendered on the screen.
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */

public class RenderMap {

    private VarBlock[][] renderMap;

    /**
     * Instantiates a new Render map.
     * @param width the width
     */
    public RenderMap(int width){
        if (width <= 15){
            renderMap = new VarBlock[10][15];
        } else {
            renderMap = new VarBlock[10][width];
        }
    }

    /**
     * Get block var block [ ] [ ].
     * @return the var block [ ] [ ]
     */
    public VarBlock[][] getBlock() {
        return renderMap;
    }

    /**
     * Sets render map.
     * @param blockMap the block map
     */
    public void setRenderMap(VarBlock[][] blockMap) {
        this.renderMap = blockMap;
    }

    /**
     * Get height int.
     * @return the int
     */
    public int getHeight(){
        return renderMap.length;
    }

    /**
     * Get width int.
     * @return the int
     */
    public int getWidth(){
        return renderMap[0].length;
    }

    /**
     * Load map from block map.
     * @param blockMap the block map
     */
    public void loadMapFromBlockMap(BlockMap blockMap){
        int height = blockMap.getHeight();
        int width = blockMap.getWidth();

        for (int yBlock = 0; yBlock < height; yBlock++){
            for (int xBlock = 0; xBlock < width; xBlock++) {
                renderMap[yBlock][xBlock] = new VarBlock(BlockUtil.getBlock(blockMap.getBlockMap(yBlock, xBlock)));
            }
        }
    }

    /**
     * Set block.
     * @param yBlock the y block
     * @param xBlock the x block
     * @param block  the block
     */
    public void setBlock(int yBlock, int xBlock, VarBlock block){
        if (yBlock - 1 <= renderMap.length && xBlock - 1 <= renderMap[0].length){
            renderMap[yBlock][xBlock] = block;
        } else {
            System.err.println("Invalid block position");
            System.err.println("Pixel Y: " + yBlock + ", X: " + xBlock);
        }
    }

    /**
     * Get block var block.
     * @param yBlock the y block
     * @param xBlock the x block
     * @return the var block
     */
    public VarBlock getBlock(int yBlock, int xBlock){
        if (yBlock - 1 <= renderMap.length && xBlock - 1 <= renderMap[0].length){
            return renderMap[yBlock][xBlock];
        } else {
            System.err.println("Invalid block position");
            System.err.println("Pixel Y: " + yBlock + ", X: " + xBlock);
            return null;
        }
    }

    /**
     * Set block pixel.
     * @param yBlock      the y block
     * @param xBlock      the x block
     * @param yBlockPixel the y block pixel
     * @param xBlockPixel the x block pixel
     * @param color       the color
     */
    public void setBlockPixel(int yBlock, int xBlock, int yBlockPixel, int xBlockPixel, Color color){
        if (yBlock - 1 <= renderMap.length && xBlock - 1 <= renderMap[0].length){
            if (yBlockPixel >= 0 && yBlockPixel < 16 && xBlockPixel >= 0 && xBlockPixel < 16){
                renderMap[yBlock][xBlock].setPixelColor(yBlockPixel, xBlockPixel, color);
            } else {
                System.err.println("Invalid pixel position");
                System.err.println("Pixel Y: " + yBlockPixel + ", X: " + xBlockPixel);
            }
        } else {
            System.err.println("Invalid block position");
            System.err.println("Pixel Y: " + yBlock + ", X: " + xBlock);
        }
    }

    /**
     * Get block pixel color.
     * @param yBlock      the y block
     * @param xBlock      the x block
     * @param yBlockPixel the y block pixel
     * @param xBlockPixel the x block pixel
     * @return the color
     */
    public Color getBlockPixel(int yBlock, int xBlock, int yBlockPixel, int xBlockPixel){
        if (yBlock - 1 <= renderMap.length && xBlock - 1 <= renderMap[0].length){
            if (yBlockPixel >= 0 && yBlockPixel < 16 && xBlockPixel >= 0 && xBlockPixel < 16){
                return renderMap[yBlock][xBlock].getPixelColor(yBlockPixel, xBlockPixel);
            } else {
                System.err.println("Invalid pixel position");
                System.err.println("Pixel Y: " + yBlockPixel + ", X: " + xBlockPixel);
                return null;
            }
        } else {
            System.err.println("Invalid block position");
            System.err.println("Pixel Y: " + yBlock + ", X: " + xBlock);
            return null;
        }
    }
}
