package Util;

import java.util.Random;

public class MyRandom {

    private static final Random random = new Random();

    public static int randomNumberBetween(int min, int max){
        return random.nextInt((max - min) + 1) + min;
    }

}
