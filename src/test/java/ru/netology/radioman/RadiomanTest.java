package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void setCurrentStation() {
        Radio station = new Radio();
        int expected = 6;

        station.setCurrentStation(expected);

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void wrongMinValueSetCurrentStation() {
        Radio station = new Radio();
        int expected = station.getCurrentStation();

        station.setCurrentStation(-1);

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void wrongMaxValueSetCurrentStation() {
        Radio station = new Radio();
        int expected = station.getCurrentStation();

        station.setCurrentStation(10);

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void clickNextRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.nextStation();

        int expected = 0;

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void clickDoubleNextRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.nextStation();
        station.nextStation();

        int expected = 1;

        assertEquals(expected, station.getCurrentStation());
    }


    @Test
    void clickPrevRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.prevStation();


        int expected = 9;

        assertEquals(expected, station.getCurrentStation());
    }

    @Test
    void pushDoublePrevRadioStation() {
        Radio station = new Radio();
        station.setCurrentStation(2);
        station.prevStation();
        station.prevStation();


        int expected = 0;

        assertEquals(expected, station.getCurrentStation());
    }


    @Test
    void setCurrentVolume() {
        Radio station = new Radio();
        int expected = 9;

        station.setCurrentVolume(expected);

        assertEquals(expected, station.getCurrentVolume());
    }

    @Test
    void wrongMaxValueSetCurrentVolume() {
        Radio station = new Radio();
        int expected = station.getCurrentVolume();

        station.setCurrentVolume(11);

        assertEquals(expected, station.getCurrentVolume());
    }

    @Test
    void wrongMinValueSetCurrentVolume() {
        Radio station = new Radio();
        int expected = station.getCurrentVolume();

        station.setCurrentVolume(-1);

        assertEquals(expected, station.getCurrentVolume());
    }

    @Test
    void volumeUpCurrentVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(10);

        station.increaseCurrentVolume();

        assertEquals(station.getMaxVolume(), station.getCurrentVolume());
    }

    @Test
    void volumeDoubleUpCurrentVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(9);

        station.increaseCurrentVolume();
        station.increaseCurrentVolume();

        assertEquals(station.getMaxVolume(), station.getCurrentVolume());
    }

    @Test
    void volumeDownCurrentVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(0);

        station.decreaseCurrentVolume();

        assertEquals(station.getMinVolume(), station.getCurrentVolume());
    }

    @Test
    void volumeDoubleDownCurrentVolume() {
        Radio station = new Radio();
        station.setCurrentVolume(1);

        station.decreaseCurrentVolume();
        station.decreaseCurrentVolume();

        assertEquals(station.getMinVolume(), station.getCurrentVolume());
    }
}