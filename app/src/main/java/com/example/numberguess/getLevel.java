package com.example.numberguess;
import java.util.Random;
import java.util.logging.Level;

public class getLevel {


    public String levelChosen = "";
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


    public void getValueOfLevel()
    { levelChosen = levelActivity.getLevelChosen(); }

    public int getRandomNum() {
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


    public String getGameActivityText() {
        String text = "";

        if (levelChosen.equals("easy") == true)
        {
           text = "This is the easy level. Input a number from 1-10 into the box below and click enter! If your looking to exit the game, click exit or enter 0";
        }
        else if (levelChosen.equals("medium") == true)
        {
            text = "This is the medium level. Input a number from 1-30 into the box below and click enter! If your looking to exit the game, click exit or enter 0";

        }
        else if (levelChosen.equals("hard") == true)
        {
            text = "This is the hard level. Input a number from 1-50 into the box below and click enter! If your looking to exit the game, click exit or enter 0";

        }
        else if (levelChosen.equals("extreme") == true)
        {
            text = "This is the extreme level. Input a number from 1-100 into the box below and click enter! If your looking to exit the game, click exit or enter 0";

        }

        return text;

    }

    public static boolean checkAnswerCorrect(int randomNum, int guessedNum){
        boolean guessedRandomNum = false;
        if(randomNum == guessedNum)
        {
            guessedRandomNum = true;
        }

        return guessedRandomNum;
    }

    public int gethighscore(int currentPoints, boolean answerCorrect){

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

    public String getHint(int randomNum, int guessedNum)
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













}
