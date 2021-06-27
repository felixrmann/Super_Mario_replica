package MarioRipoff.Loader;

import MarioRipoff.Model.Position;
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
    public static JSONObject loadConfig(){
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

    /**
     * returns the pixel size
     * @return the pixelSize
     */
    public static int getPixelSize(){
        return loadConfig().getInt("pixelSize");
    }

    /**
     * returns the default map size
     * @return the default map size (height, width)
     */
    public static Position getDefaultPixelHeight(){
        JSONObject configObject = loadConfig();
        return new Position(configObject.getInt("defaultMapHeight"), configObject.getInt("defaultMapWidth"));
    }
}
