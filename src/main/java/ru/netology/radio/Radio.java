package ru.netology.radio;


public class Radio {
    private int currentStation;
    private int currentVolume = 5;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        currentStation++;
        if (currentStation == 10) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        currentStation--;
        if (currentStation == -1) {
            currentStation = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
