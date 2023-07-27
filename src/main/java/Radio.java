public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int station) {
        if (station < 0) {
            return;
        } else if (station > 9) {
            return;
        } else {
            currentStation = station;
        }
    }

    public int getCurrentRadioStation() {
        return currentStation;
    }

    public void nextRadioStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevRadioStation() {
        if (currentStation == 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public void setCurrentVolume(int volume) {
        if (volume < 0) {
            return;
        } else if (volume > 10) {
            return;
        } else {
            currentVolume = volume;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

}
