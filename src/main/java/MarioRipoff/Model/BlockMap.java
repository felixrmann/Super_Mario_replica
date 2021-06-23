package MarioRipoff.Model;

import MarioRipoff.Loader.MapLoader;
import MarioRipoff.Util.BlockUtil;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.Vector;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */

public class BlockMap {

    private char[][] blockMap;
    private String mapName;
    private int width, height;

    public BlockMap(String mapName, int width, int height){
        this.mapName = mapName;
        this.width = width;
        this.height = height;

        //TODO + 2 (only in render Map)
        blockMap = new char[height][width];
        for (int i = 0; i < height; i++) {
            Arrays.fill(blockMap[i], ' ');
        }

        Vector<Position> allPositions = getBlockPos();

        for (int i = 0; i < allPositions.size(); i++) {
            Position currentPos = allPositions.get(i);
            blockMap[currentPos.getyPosition()][currentPos.getxPosition()] = currentPos.getBlockShort();
        }
    }

    public Vector<Position> getBlockPos(){

        Vector<Position> allPosition = new Vector<>();

        char[] allBlocks = BlockUtil.getAllBlockShorts();
        JSONObject mainObject = MapLoader.loadMap(mapName);
        JSONObject allArrayObject = (JSONObject) mainObject.get("mapData");

        for (char currBlock : allBlocks) {
            JSONArray jsonArrayX = allArrayObject.getJSONArray(currBlock + "x");
            JSONArray jsonArrayY = allArrayObject.getJSONArray(currBlock + "y");

            for (int j = 0; j < jsonArrayX.length(); j++) {
                allPosition.add(new Position(currBlock, jsonArrayY.getInt(j), jsonArrayX.getInt(j)));
            }
        }

        return allPosition;
    }

    public char getBlockMap(int yBlock, int xBlock){
        return blockMap[yBlock][xBlock];
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
