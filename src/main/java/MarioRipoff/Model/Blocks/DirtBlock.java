package MarioRipoff.Model.Blocks;

import java.awt.*;
import java.util.Arrays;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 17
 */

public class DirtBlock extends Block {

    //Colors
    private Color b = new Color(83, 48, 10);

    //16 * 16 color map
    Color[][] blockMap = new Color[16][16];

    /**
     * constructor for a DirtBlock
     */
    public DirtBlock() {

        for (int i = 0; i < 16; i++) {
            Arrays.fill(blockMap[i], b);
        }

        setBlockName("Dirt");
        setBlockShort('D');
        setBlockMap(blockMap);
    }
}
