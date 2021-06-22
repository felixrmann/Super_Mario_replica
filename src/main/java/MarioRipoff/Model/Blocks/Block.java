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
}