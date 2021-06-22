package MarioRipoff.Model;

import MarioRipoff.Model.Blocks.VarBlock;
import MarioRipoff.Util.BlockUtil;

import java.awt.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */

public class RenderMap {

    private VarBlock[][] renderMap;

    public RenderMap(int width, int height){
        renderMap = new VarBlock[width][height];
    }

    public VarBlock[][] getBlock() {
        return renderMap;
    }

    public void setRenderMap(VarBlock[][] blockMap) {
        this.renderMap = blockMap;
    }

    public int getHeight(){
        return renderMap.length;
    }

    public int getWidth(){
        return renderMap[0].length;
    }
    
    public void loadMapFromBlockMap(BlockMap blockMap){
        int height = blockMap.getHeight();
        int width = blockMap.getWidth();

        for (int yBlock = 0; yBlock < height; yBlock++){
            for (int xBlock = 0; xBlock < width; xBlock++) {
                renderMap[yBlock][xBlock] = new VarBlock(BlockUtil.getBlock(blockMap.getBlockMap(yBlock, xBlock)));
            }
        }
    }

    public void setBlock(int yBlock, int xBlock, VarBlock block){
        if (yBlock - 1 <= renderMap.length && xBlock - 1 <= renderMap[0].length){
            renderMap[yBlock][xBlock] = block;
        } else {
            System.err.println("Invalid block position");
            System.err.println("Pixel Y: " + yBlock + ", X: " + xBlock);
        }
    }

    public VarBlock getBlock(int yBlock, int xBlock){
        if (yBlock - 1 <= renderMap.length && xBlock - 1 <= renderMap[0].length){
            return renderMap[yBlock][xBlock];
        } else {
            System.err.println("Invalid block position");
            System.err.println("Pixel Y: " + yBlock + ", X: " + xBlock);
            return null;
        }
    }

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
