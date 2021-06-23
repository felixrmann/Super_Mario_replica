package MarioRipoff.Model.Blocks;

import java.awt.*;
import java.util.Arrays;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */

public class AirBlock extends Block{

    private Color b = new Color(98, 183, 255);

    //16 * 16 color map
    Color[][] blockMap = new Color[16][16];

    /**
     * constructor for a AirBlock
     */
    public AirBlock() {

        for (int i = 0; i < 16; i++) {
            Arrays.fill(blockMap[i], b);
        }

        setBlockName("Air");
        setBlockShort(' ');
        setBlockMap(blockMap);
    }
}
