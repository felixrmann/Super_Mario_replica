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

public class ConfigLoader {

    private static String fileName = "config.json";
    private static final String filePath = "src\\main\\resources\\Config\\";

    /**
     * returns the requested config data
     * @return the config data
     */
    public static JSONObject loadPlayer(){
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
