public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public void setCurrentRadioStation(int station) {
        if (station < 0) {
            return;
        } else if (station > 9) {
            return;
        } else {
            currentRadioStation = station;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation--;
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
