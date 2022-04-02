package com.example.numberguess;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;

import java.util.Random;
import java.util.logging.Level;

public class getLevel {



    public int pointsCounter = 1;

    public int easyHSPoints = 0;
    public int easyHSAnsCor = 0;

    public int mediumHSPoints = 0;
    public int mediumHSAnsCor = 0;

    public int hardHSPoints = 0;
    public int hardHSAnsCor = 0;

    public int extremeHSPoints = 0;
    public int extremeHSAnsCor = 0;

    LevelActivity levelActivity = new LevelActivity();





    public static int getRandomNum(String levelChosen) {
        int randomNum = 0;

        if (levelChosen.equals("easy") == true)
        {
            Random rand=new Random();
            randomNum =rand.nextInt(10)+1;
        }
        else if (levelChosen.equals("medium") == true)
        {
            Random rand=new Random();
            randomNum =rand.nextInt(29)+1;
        }
        else if (levelChosen.equals("hard") == true)
        {
            Random rand=new Random();
            randomNum =rand.nextInt(49)+1;
        }
        else if (levelChosen.equals("extreme") == true)
        {
            Random rand=new Random();
            randomNum =rand.nextInt(99)+1;
        }

        return randomNum;

    }





    public static boolean checkAnswerCorrect(int randomNum, int guessedNum){
        boolean guessedRandomNum = false;
        if(randomNum == guessedNum)
        {
            guessedRandomNum = true;
        }

        return guessedRandomNum;
    }

    public int gethighscore(int currentPoints, boolean answerCorrect, String levelChosen){

        int basePoint = 0;
        int pointAdd = 1;

        if(answerCorrect == true) {

            if (levelChosen.equals("easy") == true) {
                basePoint = 1;

                if (pointsCounter == 1) {
                    pointAdd = basePoint;
                } else {
                    for (int i = 0; i < pointsCounter - 1; i++) {
                        pointAdd = 2 * basePoint;
                    }
                }
                currentPoints = currentPoints + pointAdd;

                easyHSPoints = currentPoints;
                easyHSAnsCor++;


            } else if (levelChosen.equals("medium") == true) {
                basePoint = 2;

                if (pointsCounter == 1) {
                    pointAdd = basePoint;
                } else {
                    for (int i = 0; i < pointsCounter - 1; i++) {
                        pointAdd = 2 * basePoint;
                    }
                }
                currentPoints = currentPoints + pointAdd;

                mediumHSPoints = currentPoints;
                mediumHSAnsCor++;


            } else if (levelChosen.equals("hard") == true) {
                basePoint = 3;

                if (pointsCounter == 1) {
                    pointAdd = basePoint;
                } else {
                    for (int i = 0; i < pointsCounter - 1; i++) {
                        pointAdd = 2 * basePoint;
                    }
                }
                currentPoints = currentPoints + pointAdd;

                hardHSPoints = currentPoints;
                hardHSAnsCor++;

            } else if (levelChosen.equals("extreme") == true) {
                basePoint = 5;

                if (pointsCounter == 1) {
                    pointAdd = basePoint;
                } else {
                    for (int i = 0; i < pointsCounter - 1; i++) {
                        pointAdd = 2 * basePoint;
                    }
                }
                currentPoints = currentPoints + pointAdd;

                extremeHSPoints = currentPoints;
                extremeHSAnsCor++;
            }
        }
        else
        {
            pointsCounter = 1;
        }

        return currentPoints;

    }

    public static String getHint(int randomNum, int guessedNum)
    {
        String hint = "";

        boolean guessedRandomNum = false;
        if(randomNum == guessedNum)
        {
            guessedRandomNum = true;
        }

        if(guessedRandomNum == false)
        {
            if(randomNum>guessedNum)
            {
                hint = "The random number is greater than your guessed number";
            }
            else if(randomNum<guessedNum)
            {
                hint = "The random number is less than your guessed number";
            }
        }
        return hint;
    }







    public static int toInteger(String n){
        int t = Integer.parseInt(n);
        return t;
    }
}
