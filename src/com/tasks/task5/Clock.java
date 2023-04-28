package com.tasks.task5;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public Clock() {
    }

    public void addHour(int a) {
        int newHour = this.hour + a;
        if (a < 0) {
            return;
        }
        this.hour = newHour % 24;

    }

    public void addMinute(int a) {
        int newMinute = this.minute + a;
        if (a < 0) {
            return;
        }
        this.minute = newMinute % 60;
        addHour(newMinute / 60);
    }

    public void addSecond(int a) {
        int newSec = this.second + a;
        if (a < 0) {
            return;
        }
        this.second = newSec % 60;
        addMinute(newSec / 60);
    }

    private int clockToSecond(Clock clock) {

        return ((clock.getHour() * 60) * 60) + (clock.getMinute() * 60) + clock.getSecond();
    }

    //    public int clockToSecond(){
//
//        return ((hour * 60) * 60) + minute * 60 + second;
//    }
    public boolean isBefore(Clock clock) {
        int thisResult = clockToSecond(this);
        int clockResult = clockToSecond(clock);

        return thisResult < clockResult;
//        return clockToSecond() < clock.clockToSecond();
    }

    public boolean isAfter(Clock clock) {
        int thisResult = clockToSecond(this);
        int clockResult = clockToSecond(clock);
        return thisResult > clockResult;
    }

    public boolean isSame(Clock clock) {
        int thisResult = clockToSecond(this);
        int clockResult = clockToSecond(clock);
        return thisResult == clockResult;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = (hour < 0)? 0 : hour % 24;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 60) {
            this.minute = minute;
        } else if (minute < 0) {
            this.minute = 0;
        } else {
            this.minute = 60;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 60) {
            this.second = second;
        } else if (second < 0) {
            second = 60;
        } else {
            second = 0;
        }
    }

    @Override
    public String toString() {
        return "Clock{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}
