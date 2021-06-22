package MarioRipoff.Model.Blocks;

import java.awt.*;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 17
 */

public class DirtBlock extends Block {

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
    public DirtBlock() {
        setBlockName("Dirt");
        setBlockShort('D');
        setBlockMap(blockMap);
    }
}
