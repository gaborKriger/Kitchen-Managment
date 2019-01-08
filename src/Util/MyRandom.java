package Util;

import java.util.HashMap;
import java.util.Random;

public class MyRandom {

    private static final Random random = new Random();

    public static int randomNumberBetween(int min, int max){
        return random.nextInt((max - min) + 1) + min;
    }

    public static boolean randomBoolean() {
        return random.nextBoolean();
    }

    public static String randomIngredients() {
        HashMap<Integer,String> ingredietnsGuide = new HashMap<>();
        ingredietnsGuide.put(1,"carrot");
        ingredietnsGuide.put(2,"potato");
        ingredietnsGuide.put(3,"meat");

        int randomNumber = randomNumberBetween(1,3);

        return ingredietnsGuide.get(randomNumber);
    }

}
