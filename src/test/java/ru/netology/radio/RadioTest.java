package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    // проверка номера радиостанции

    @Test
    public void shouldSetValidRadio1() {
        Radio radio = new Radio();
        radio.setNumberOfRadio(7);

        int expected = 7;
        int actual = radio.getNumberOfRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetValidRadio2() {
        Radio radio = new Radio(100);
        radio.setNumberOfRadio(99);

        int expected = 99;
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
        Radio radio = new Radio(0);
        radio.setNumberOfRadio(10);

        int expected = 0;
        int actual = radio.getNumberOfRadio();
        Assertions.assertEquals(expected, actual);
    }

    // проверки переключения на следущую радиостанцию

    @Test
    public void shouldNext1() {
        Radio radio = new Radio(5);
        radio.setNumberOfRadio(4);
        radio.next();

        int expected = 0;
        int actual = radio.getNumberOfRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNext2() {
        Radio radio = new Radio(0);
        radio.setNumberOfRadio(8);
        radio.next();

        int expected = 9;
        int actual = radio.getNumberOfRadio();
        Assertions.assertEquals(expected, actual);
    }

    // проверки переключения на предыдущую радиостанцию

    @Test
    public void shouldPrev1() {
        Radio radio = new Radio(1);
        radio.setNumberOfRadio(0);
        radio.prev();

        int expected = 0;
        int actual = radio.getNumberOfRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev2() {
        Radio radio = new Radio(101);
        radio.setNumberOfRadio(0);
        radio.prev();

        int expected = 100;
        int actual = radio.getNumberOfRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrev3() {
        Radio radio = new Radio(2);
        radio.setNumberOfRadio(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getNumberOfRadio();
        Assertions.assertEquals(expected, actual);
    }

    // проверка на увеличение громкости

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
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetIncreaseVolume3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    // проверка на уменьшение громкости

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

