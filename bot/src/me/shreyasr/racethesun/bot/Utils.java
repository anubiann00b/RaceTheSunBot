package me.shreyasr.racethesun.bot;

public class Utils {
    private static final String STEAM_DIR = "C:\\Program Files (x86)\\Steam";
    private static final String RELATIVE_LOG_PATH
            = "\\steamapps\\common\\RaceTheSun\\RaceTheSun_Data\\output_log.txt";
    public static final String GAME_END_STRING = "Stats saved to the server successfully.";

    public static String getLogFile() {
        return STEAM_DIR + RELATIVE_LOG_PATH;
    }
}
