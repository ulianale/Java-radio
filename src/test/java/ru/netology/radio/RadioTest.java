package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetValidRadio() {
        Radio radio = new Radio();
        radio.setNumberOfRadio(7);

        int expected = 7;
        int actual = radio.getNumberOfRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetInValidRadio1() {
        Radio radio = new Radio();
        radio.setNumberOfRadio(-1);

        int expected = 0;
        int actual = radio.getNumberOfRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetInvalidRadio2() {
        Radio radio = new Radio();
        radio.setNumberOfRadio(10);

        int expected = 0;
        int actual = radio.getNumberOfRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext1() {
        Radio radio = new Radio();
        radio.setNumberOfRadio(8);
        radio.next();

        int expected = 9;
        int actual = radio.getNumberOfRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext2() {
        Radio radio = new Radio();
        radio.setNumberOfRadio(9);
        radio.next();

        int expected = 0;
        int actual = radio.getNumberOfRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev1() {
        Radio radio = new Radio();
        radio.setNumberOfRadio(0);
        radio.prev();

        int expected = 9;
        int actual = radio.getNumberOfRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev2() {
        Radio radio = new Radio();
        radio.setNumberOfRadio(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getNumberOfRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-3);
        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

