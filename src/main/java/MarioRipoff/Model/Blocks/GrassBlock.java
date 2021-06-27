package MarioRipoff.Model.Blocks;

import java.awt.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 27
 */

public class GrassBlock extends Block {

    //Colors
    private Color b = new Color(138, 76, 0);
    private Color g = new Color(33, 125, 19);

    //16 * 16 color map
    Color[][] blockMap = new Color[][]{
            {g,g,g,g,g,g,g,g,g,g,g,g,g,g,g,g},
            {g,g,g,g,g,g,g,g,g,g,g,g,g,g,g,g},
            {g,g,g,g,g,g,g,g,g,g,g,g,g,g,g,g},
            {g,g,g,g,g,g,g,g,g,g,g,g,g,g,g,g},
            {b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
            {b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
            {b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
            {b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
            {b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
            {b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
            {b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
            {b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
            {b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
            {b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
            {b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
            {b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b},
    };

    /**
     * constructor for a DirtBlock
     */
    public GrassBlock() {
        setBlockName("Grass");
        setBlockShort('G');
        setBlockMap(blockMap);
    }
}
