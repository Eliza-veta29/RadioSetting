import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class RadioTest {
    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "8,8", "9,9", "-1,0", "10,0"})
    public void shouldSetRadioStation(int inRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(inRadioStation);
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,1", "1,2", "8,9", "9,0", "-1,0", "10,0"})
    public void shouldNextRadioStation(int inRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(inRadioStation);
        radio.nextRadioStation();
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,9", "1,0", "8,7", "9,8", "-1,9", "10,9"})
    public void shouldPrevRadioStation(int inRadioStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(inRadioStation);
        radio.prevRadioStation();
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "1,1", "99,99", "100,100", "-1,0", "101,0"})
    public void shouldSetVolume(int inVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(inVolume);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,1", "1,2", "99,100", "100,100", "-1,1", "101,1"})
    public void shouldIncreaseVolume(int inVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(inVolume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"0,0", "1,0", "99,98", "100,99", "-1,0", "101,0"})
    public void shouldDecreaseVolume(int inVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(inVolume);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"-5,5,0", "30,0,0", "30,1,1", "30,28,28", "30,29,29", "30,-1,0", "30,30,0"})
    public void shouldSetStationSetNumberRadio(int inSetNumberRadio, int inRadioStation, int expected) {
        Radio radio = new Radio(inSetNumberRadio);
        radio.setCurrentRadioStation(inRadioStation);
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"-5,5,0", "30,0,1", "30,1,2", "30,28,29", "30,29,0", "30,-1,0", "30,30,0"})
    public void shouldNextStationSetNumberRadio(int inSetNumberRadio, int inRadioStation, int expected) {
        Radio radio = new Radio(inSetNumberRadio);
        radio.setCurrentRadioStation(inRadioStation);
        radio.nextRadioStation();
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"-5,5,0", "30,0,29", "30,1,0", "30,28,27", "30,29,28", "30,-1,29", "30,30,29"})
    public void shouldPrevStationSetNumberRadio(int inSetNumberRadio, int inRadioStation, int expected) {
        Radio radio = new Radio(inSetNumberRadio);
        radio.setCurrentRadioStation(inRadioStation);
        radio.prevRadioStation();
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"30,0,0", "30,1,1", "30,99,99", "30,100,100", "30,-1,0", "30,101,0"})
    public void shouldSetVolumeSetNumberRadio(int inSetNumberRadio, int inVolume, int expected) {
        Radio radio = new Radio(inSetNumberRadio);
        radio.setCurrentVolume(inVolume);
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"30,0,1", "30,1,2", "30,99,100", "30,100,100", "30,-1,1", "30,101,1"})
    public void shouldIncreaseVolumeSetNumberRadio(int inSetNumberRadio, int inVolume, int expected) {
        Radio radio = new Radio(inSetNumberRadio);
        radio.setCurrentVolume(inVolume);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({"30,0,0", "30,1,0", "30,99,98", "30,100,99", "30,-1,0", "30,101,0"})
    public void shouldDecreaseVolumeSetNumberRadio(int inSetNumberRadio, int inVolume, int expected) {
        Radio radio = new Radio(inSetNumberRadio);
        radio.setCurrentVolume(inVolume);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}