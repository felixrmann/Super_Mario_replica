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
 * @since 2021 - June - 22
 */

public class PlayerLoader {

    private static String fileName = "";
    private static final String filePath = "src\\main\\resources\\Player\\";

    /**
     * returns the requested playerData
     * @param playerName
     * @return the playerData
     */
    public static JSONObject loadPlayer(String playerName){
        PlayerLoader.fileName = playerName + ".json";

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
