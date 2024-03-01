package com.Unathi.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessingGameTest {

    @Test
    public void testSimpleWin(){
        GuessingGame gg = new GuessingGame();
        int randomNum = gg.getRandomNum();
        String message = gg.guess(randomNum);
        assertEquals("You got this",message);
    }

    @Test
    public void testOneWrongNegative(){
        GuessingGame gg = new GuessingGame();
        String message = gg.guess(-5);
        assertEquals("You didn't this",message);
    }

    @Test
    public void testOneWrongPostive(){
        GuessingGame gg = new GuessingGame();
        int randomNum = gg.getRandomNum();
        String message = gg.guess(randomNum + 1);
        assertEquals("You didn't this",message);
    }
}
