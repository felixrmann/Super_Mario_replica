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

    private static String fileName = "";
    private static final String filePath = "src\\main\\resources\\Map\\";

    /**
     * returns the requested mapData
     * @param mapName
     * @return the mapData
     */
    public static JSONObject loadMap(String mapName){
        MapLoader.fileName = mapName + ".json";

        return new JSONObject(Objects.requireNonNull(loadFileString()));
    }

    /**
     load file content to String
     @return String
     */
    private static String loadFileString(){
        try {
            return Files.readString(Path.of(filePath + fileName), StandardCharsets.US_ASCII);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
