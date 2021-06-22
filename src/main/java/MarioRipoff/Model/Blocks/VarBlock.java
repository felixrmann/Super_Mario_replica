package MarioRipoff.Model.Blocks;

import java.awt.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 22
 */

public class VarBlock extends Block{

    public VarBlock(Block block){
        setBlockName(block.blockName);
        setBlockShort(block.blockShort);
        setBlockMap(block.blockMap);
    }

    public void setPixelColor(int yPixel, int xPixel, Color color){
        if (yPixel >= 0 && yPixel < 16 && xPixel >= 0 && xPixel < 16){
            blockMap[yPixel][xPixel] = color;
        } else {
            System.err.println("Invalid pixel position");
            System.err.println("Pixel Y: " + yPixel + ", X: " + xPixel);
        }
    }
}
