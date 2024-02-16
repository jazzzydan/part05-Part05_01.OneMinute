public class Timer {

    private ClockHand seconds;
    private ClockHand milliSeconds;

    public Timer() {
        this.seconds = new ClockHand(60);
        this.milliSeconds = new ClockHand(100);
    }

    public void advance() {
        this.milliSeconds.advance();
        if (this.milliSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    @Override
    public String toString() {
        return seconds + ":" + milliSeconds;
    }
}
