package com.pluralsight;

public class Dice {
    // does math
    public int roll(){
        int randomNumber = (int)(Math.random() * 6) + 1;
        return randomNumber;
    }


}
