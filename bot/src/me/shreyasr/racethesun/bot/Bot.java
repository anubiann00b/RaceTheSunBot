package me.shreyasr.racethesun.bot;

public class Bot {

    public static void main(String[] args) {
        ReadLogThread logThread = new ReadLogThread();
        logThread.init();
    }
}
