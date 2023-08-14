public class Radio {
    private int currentRadioStation = 10;
    private int maxCurrentRadioStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio() {
        this.maxCurrentRadioStation = currentRadioStation - 1;
    }

    public Radio(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
        this.maxCurrentRadioStation = currentRadioStation - 1;
    }

    public void setCurrentRadioStation(int station) {
        if (station < 0) {
            return;
        } else if (station > maxCurrentRadioStation) {
            return;
        } else {
            currentRadioStation = station;
        }
    }

    public int getCurrentRadioStation() {
        if (currentRadioStation < 0) {
            return 0;
        } else if (currentRadioStation > maxCurrentRadioStation) {
            return 0;
        } else {
            return currentRadioStation;
        }
    }

    public void nextRadioStation() {
        if (currentRadioStation == maxCurrentRadioStation) {
            currentRadioStation = 0;
        } else {
            currentRadioStation++;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = maxCurrentRadioStation;
        } else {
            currentRadioStation--;
        }
    }

    public void setCurrentVolume(int volume) {
        if (volume < minVolume) {
            return;
        } else if (volume > maxVolume) {
            return;
        } else {
            currentVolume = volume;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }
}