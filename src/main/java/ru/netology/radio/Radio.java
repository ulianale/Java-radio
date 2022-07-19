package ru.netology.radio;

public class Radio {
    private int currentNumberOfRadio;
    private int currentVolume;
    private boolean valid;     // добавила чтобы проверить допустимость номера радиостанции

    public int getNumberOfRadio() {
        return currentNumberOfRadio;
    }

    public void setNumberOfRadio(int newNumberOfRadio) {
        if (newNumberOfRadio < 0 || newNumberOfRadio > 9) {
            return;
        }
        currentNumberOfRadio = newNumberOfRadio;
        valid = true;
    }

    public boolean getValidRadio() { // допустимость радиостанции
        return valid;
    }

    public void next() {
        if (currentNumberOfRadio < 9) {
            currentNumberOfRadio += 1;
        } else {
            currentNumberOfRadio = 0;
        }
    }

    public void prev() {
        if (currentNumberOfRadio > 0) {
            currentNumberOfRadio -= 1;
        } else {
            currentNumberOfRadio = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            currentVolume = 10;
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 1;
        }
    }
}
