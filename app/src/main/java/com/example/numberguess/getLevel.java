package com.example.numberguess;
import java.util.Random;
public class getLevel {

    public static int easy(){
        Random rand=new Random();
        int easy=rand.nextInt(10)+1;
        return easy;
    }
    public static int medium(){
        Random rand=new Random();
        int medium=rand.nextInt(29)+1;
        return medium;
    }
    public static int hard(){
        Random rand=new Random();
        int hard=rand.nextInt(49)+1;
        return hard;
    }
    public static int extreme(){
        Random rand=new Random();
        int extreme=rand.nextInt(99)+1;
        return extreme;
    }


    public static int toInteger(String n){
        int t = Integer.parseInt(n);
        return t;
    }
}
