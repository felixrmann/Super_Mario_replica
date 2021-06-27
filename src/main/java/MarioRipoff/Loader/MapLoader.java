package MarioRipoff.Loader;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

/**
 * @author Felix Mann
 * @version 1.0
 * @since 2021 - June - 21
 */

public class MapLoader {

    private static JSONObject mapFile;
    private static String fileName = "";
    private static final String filePath = "src\\main\\resources\\Map\\";

    /**
     * check if file has to be reload to minimize time loss
     * @param fileName fileName
     */
    public static void checkFile(String fileName){
        if (!(mapFile == null)){
            if (!mapFile.getString("mapFileName").equals(fileName)){
                mapFile = loadMap(fileName);
            }
        } else {
            mapFile = loadMap(fileName);
        }
    }

    /**
     * returns the requested mapData
     * @param fileName fileName
     * @return the mapData
     */
    private static JSONObject loadMap(String fileName){
        MapLoader.fileName = fileName + ".json";

        return new JSONObject(Objects.requireNonNull(loadFileString()));
    }

    /**
     * load file content to String
     * @return String
     */
    private static String loadFileString(){
        try {
            return Files.readString(Path.of(filePath + fileName), StandardCharsets.US_ASCII);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * loads the map name
     * @param fileName fileName
     * @return mapName
     */
    public static String getMapName(String fileName){
        checkFile(fileName);
        return mapFile.getString("mapName");
    }

    /**
     * loads the map width
     * @param fileName fileName
     * @return mapWidth
     */
    public static int getMapWidth(String fileName){
        checkFile(fileName);
        return mapFile.getInt("mapWidth");
    }

    /**
     * loads the player Y position
     * @param fileName fileName
     * @return playerYPosition
     */
    public static int getStartPlayerYPos(String fileName){
        checkFile(fileName);
        return mapFile.getInt("playerPosY");
    }

    /**
     * loads the player X position
     * @param fileName fileName
     * @return playerXPosition
     */
    public static int getStartPlayerXPos(String fileName){
        checkFile(fileName);
        return mapFile.getInt("playerPosX");
    }

    /**
     * loads the mapData (which blocks have to be loaded where)
     * @param fileName fileName
     * @return mapData
     */
    public static JSONObject getMapData(String fileName){
        checkFile(fileName);
        return (JSONObject) mapFile.get("mapData");
    }
}
