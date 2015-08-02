package me.shreyasr.racethesun.bot;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadLogThread {

    public void init() {
        new Thread(() -> {
            try {
                new FileWriter(Utils.getLogFile()).close(); // Empty logs
                RandomAccessFile file = new RandomAccessFile(Utils.getLogFile(), "r");

                while(true) {
                    String line = file.readLine();
                    if (line == null) {
                        Thread.sleep(1000);
                        continue;
                    }

                    if (line.equals(Utils.GAME_END_STRING)) {
                        Log.d("GAME ENDED");
                    }
                }
            } catch (FileNotFoundException e) {
                Log.e("Log file not found: " + Utils.getLogFile());
            } catch (IOException e) {
                Log.e(e.getMessage());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
