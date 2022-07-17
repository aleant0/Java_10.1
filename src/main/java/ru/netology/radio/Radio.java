package ru.netology.radio;


public class Radio {
    private int currentStation;
    private int currentVolume = 50;
    private int maxVolume = 100;
    private int stationsAmount;

    public Radio() {
        stationsAmount = 10;
    }

    public Radio(int stationsAmount) {
        this.stationsAmount = stationsAmount;
    }

    public int getStationsAmount() {
        return stationsAmount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > stationsAmount - 1) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        currentStation++;
        if (currentStation == stationsAmount) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        currentStation--;
        if (currentStation == -1) {
            currentStation = stationsAmount - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
