package MarioRipoff.Model;

import MarioRipoff.Model.Blocks.Block;
import MarioRipoff.Model.Blocks.VarBlock;

import java.awt.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */

public class RenderMap {

    private VarBlock[][] blockMap;

    public RenderMap(int width, int height){
        blockMap = new VarBlock[width][height];
    }

    public VarBlock[][] getBlock() {
        return blockMap;
    }

    public void setBlockMap(VarBlock[][] blockMap) {
        this.blockMap = blockMap;
    }

    public int getHeight(){
        return blockMap.length;
    }

    public int getWidth(){
        return blockMap[0].length;
    }
    
    public void loadMapFromBlockMap(BlockMap blockMap){
        //TODO convert BlockMap to RenderMap with VarBlocks
    }

    public void setBlock(int yBlock, int xBlock, VarBlock block){
        if (yBlock - 1 <= blockMap.length && xBlock - 1 <= blockMap[0].length){
            blockMap[yBlock][xBlock] = block;
        } else {
            System.err.println("Invalid block position");
            System.err.println("Pixel Y: " + yBlock + ", X: " + xBlock);
        }
    }

    public VarBlock getBlock(int yBlock, int xBlock){
        if (yBlock - 1 <= blockMap.length && xBlock - 1 <= blockMap[0].length){
            return blockMap[yBlock][xBlock];
        } else {
            System.err.println("Invalid block position");
            System.err.println("Pixel Y: " + yBlock + ", X: " + xBlock);
            return null;
        }
    }

    public void setBlockPixel(int yBlock, int xBlock, int yBlockPixel, int xBlockPixel, Color color){
        if (yBlock - 1 <= blockMap.length && xBlock - 1 <= blockMap[0].length){
            if (yBlockPixel > 0 && yBlockPixel <= 16 && xBlockPixel > 0 && xBlockPixel <= 16){
                blockMap[yBlock][xBlock].setPixelColor(yBlockPixel, xBlockPixel, color);
            } else {
                System.err.println("Invalid pixel position");
                System.err.println("Pixel Y: " + yBlockPixel + ", X: " + xBlockPixel);
            }
        } else {
            System.err.println("Invalid block position");
            System.err.println("Pixel Y: " + yBlock + ", X: " + xBlock);
        }
    }

    public Color getBlockPixel(int yBlock, int xBlock, int yBlockPixel, int xBlockPixel){
        if (yBlock - 1 <= blockMap.length && xBlock - 1 <= blockMap[0].length){
            if (yBlockPixel > 0 && yBlockPixel <= 16 && xBlockPixel > 0 && xBlockPixel <= 16){
                return blockMap[yBlock][xBlock].getPixelColor(yBlockPixel, xBlockPixel);
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
