package com.example.numberguess;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AlertDialog.Builder;

import java.util.Random;
import java.util.logging.Level;

public class getLevel {





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

    public static int gethighscore(int currentPoints, String levelChosen, int pointsCounter){

        int basePoint = 0;
        int pointAdd = 1;



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
