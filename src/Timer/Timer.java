package Timer;

public class Timer {

    private double lastTime, currentTime, deltaTime;
    private int timeSeconds;
    private int timeMinutes;
    private boolean running;

    public Timer () {

    }

    public void tick() {
        if (running) {
            currentTime = System.currentTimeMillis();
            deltaTime = currentTime - lastTime;
            if (deltaTime > 1000) { //every second
                lastTime = System.currentTimeMillis();
                timeSeconds++;
            if (timeSeconds > 60) {
                timeSeconds = 0;
                timeMinutes++;
                }
            }
        }
    }

    public void startTimer() {
        running = true;
        timeSeconds = 0;
        timeMinutes = 0;
        lastTime = System.currentTimeMillis();
    }

    public void playTimer() {
        running = true;
    }

    public void pauseTimer() {
        running = false;
    }

    public void stopTimer() {
        running = false;
        timeSeconds = 0;
        timeMinutes = 0;
    }

    public int getTimeSeconds() {
        return timeSeconds;
    }
    public int getTimeMinutes() {
        return timeMinutes;
    }
    public String getTime() {
        return timeMinutes + ":" + timeSeconds;
    }
}
