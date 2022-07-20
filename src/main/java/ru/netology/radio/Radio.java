package ru.netology.radio;

public class Radio {

    private int amount = 10;
    private int minNumberRadio = 0;
    private int currentNumberOfRadio;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;
    boolean valid;                // добавила чтобы проверить допустимость номера радиостанции


    public Radio() {
    }

    public Radio(int amount) {
        if (amount > 0) {           // если (amount <= 0) то количество радиостанций по умолчанию будет = 10
            this.amount = amount;
        }
    }

    public int getNumberOfRadio() {
        return currentNumberOfRadio;
    }

    public int maxNumberRadio() {
        return minNumberRadio + amount - 1;
    }

    public void setNumberOfRadio(int newNumberOfRadio) {
        if (newNumberOfRadio < minNumberRadio || newNumberOfRadio > maxNumberRadio()) {
            return;
        }
        currentNumberOfRadio = newNumberOfRadio;
        valid = true;
    }

    public boolean getValidRadio() { // допустимость радиостанции
        return valid;
    }

    public void next() {
        if (currentNumberOfRadio < maxNumberRadio()) {
            currentNumberOfRadio += 1;
        } else {
            currentNumberOfRadio = minNumberRadio;
        }
    }

    public void prev() {
        if (currentNumberOfRadio > minNumberRadio) {
            currentNumberOfRadio -= 1;
        } else {
            currentNumberOfRadio = maxNumberRadio();
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            currentVolume = maxVolume;
            return;
        }
        currentVolume = newVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;
        }
    }
}




