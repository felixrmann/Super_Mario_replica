package MarioRipoff.Util;

import MarioRipoff.Model.Blocks.AirBlock;
import MarioRipoff.Model.Blocks.Block;
import MarioRipoff.Model.Blocks.DirtBlock;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */

public class BlockUtil {

    public static Block getBlock(char colorCode){
        switch (colorCode){
            case 'D': return new DirtBlock();
            default: return new AirBlock();
        }
    }

}
