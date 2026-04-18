package com.pluralsight;

public class DiceRoll {
    public static void main(String[] args) {
        Dice dice = new Dice();


        int roll1 = 0;
        int roll2 = 0;

        //Counters for how many times each number was rolled
        int counterTwo = 0;
        int counterFour = 0;
        int counterSix = 0;
        int counterSeven = 0;

        //loop that rolls 100 times
        // roll 2 dice while the amount of rolls is less than 100
        for (int r = 1;r <= 100;r++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            System.out.println("Roll " + r + ": " + roll1 + " - " + roll2 + " Sum: " + (roll1+roll2));
            //if statement to add 1 to counters on lines 12-15
            if (roll1 + roll2 == 2){
                counterTwo++;
            } else if (roll1 + roll2 == 4) {
                counterFour++;
            } else if (roll1 + roll2 == 6) {
                counterSix++;
            } else if (roll1 + roll2 == 7) {
                counterSeven++;
            }
        }
        //Formatted output
        System.out.println("-----------------------------------");
        System.out.print("2 was rolled " + counterTwo + " times" + "\n" + "4 was rolled " + counterFour + " times" + "\n" +
                "6 was rolled " + counterSix + " times" + "\n" + "7 was rolled " + counterSeven + " times" + "\n");









    }

}
