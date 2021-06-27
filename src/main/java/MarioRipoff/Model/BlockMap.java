package MarioRipoff.Model;

import MarioRipoff.Loader.MapLoader;
import MarioRipoff.Util.BlockUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.Vector;

/**
 * This class saves the blockMap, that means it saves on which position on the map is which kind of block. The blockMaps
 * are loaded with the MapLoader
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */

public class BlockMap {

    private char[][] blockMap;
    private String mapName;
    private int width;

    /**
     * the constructor of a BlockMap
     * @param mapName mapName
     * @param width mapWidth
     */
    public BlockMap(String mapName, int width){
        this.mapName = mapName;
        this.width = width;

        //TODO + 2 (only in render Map)
        blockMap = new char[10][width];
        for (int i = 0; i < 10; i++) {
            Arrays.fill(blockMap[i], ' ');
        }

        Vector<Position> allPositions = getBlockPos();

        for (Position currentPos : allPositions) {
            blockMap[currentPos.getYPosition()][currentPos.getXPosition()] = currentPos.getBlockShort();
        }
    }

    public Vector<Position> getBlockPos(){

        Vector<Position> allPosition = new Vector<>();

        char[] allBlocks = BlockUtil.getAllBlockShorts();
        JSONObject allArrayObject = MapLoader.getMapData(mapName);

        for (char currBlock : allBlocks) {
            try {
                JSONArray jsonArrayX = allArrayObject.getJSONArray(currBlock + "x");
                JSONArray jsonArrayY = allArrayObject.getJSONArray(currBlock + "y");

                for (int j = 0; j < jsonArrayX.length(); j++) {
                    allPosition.add(new Position(currBlock, jsonArrayY.getInt(j), jsonArrayX.getInt(j)));
                }
            } catch (JSONException ignored){}
        }

        return allPosition;
    }

    /**
     * Get block map char.
     * @param yBlock the y block
     * @param xBlock the x block
     * @return the char
     */
    public char getBlockMap(int yBlock, int xBlock){
        return blockMap[yBlock][xBlock];
    }

    /**
     * Gets height.
     * @return the height
     */
    public int getHeight() {
        return 10;
    }

    /**
     * Gets width.
     * @return the width
     */
    public int getWidth() {
        return width;
    }
}
