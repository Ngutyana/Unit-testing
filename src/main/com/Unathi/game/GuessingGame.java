package com.Unathi.game;

public class GuessingGame {
    public String guess(int guessedNumber) {
        return guessedNumber == getRandomNum() ?"You got this":"You didn't this";
    }

    public int getRandomNum() {
        return 0;
    }
}
