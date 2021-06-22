package MarioRipoff.Model;

import java.util.Arrays;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */

public class BlockMap {

    private char[][] blockMap;

    public BlockMap(int width, int height){
        //TODO + 2
        blockMap = new char[height][width];
        for (int i = 0; i < height; i++) {
            Arrays.fill(blockMap[i], ' ');
        }

        blockMap[7][0] = 'D';
        blockMap[7][1] = 'D';
        blockMap[7][2] = 'D';
        blockMap[7][3] = 'D';
        blockMap[9][0] = 'D';
        blockMap[9][1] = 'D';
        blockMap[9][2] = 'D';
        blockMap[9][3] = 'D';
        blockMap[9][4] = 'D';
        blockMap[9][5] = 'D';
        blockMap[9][6] = 'D';
        blockMap[9][7] = 'D';
        blockMap[9][8] = 'D';
        blockMap[9][9] = 'D';
    }

    public char getBlockMap(int yBlock, int xBlock){
        return blockMap[yBlock][xBlock];
    }

    public int getHeight() {
        return blockMap.length;
    }

    public int getWidth() {
        return blockMap[0].length;
    }
}
