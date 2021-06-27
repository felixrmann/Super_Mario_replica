package MarioRipoff.Util;

import MarioRipoff.Model.Blocks.AirBlock;
import MarioRipoff.Model.Blocks.Block;
import MarioRipoff.Model.Blocks.DirtBlock;
import MarioRipoff.Model.Blocks.GrassBlock;

/**
 * Just a util class which has some important but simple methods.
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */
public class BlockUtil {

    /**
     * Get block block.
     * @param colorCode the color code
     * @return the block
     */
    public static Block getBlock(char colorCode){
        switch (colorCode){
            case 'D': return new DirtBlock();
            case 'G': return new GrassBlock();
            default: return new AirBlock();
        }
    }

    /**
     * Get all block shorts char [ ].
     * @return the char [ ]
     */
    public static char[] getAllBlockShorts() {
        return new char[]{
                'D',
                'G'
        };
    }
}
