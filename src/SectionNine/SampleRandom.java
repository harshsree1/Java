package SectionNine;

import java.util.Arrays;
import java.util.Random;

public class SampleRandom {

    public static void main(String[] args) {
        int[] randomArray = new int[10];
        Random rand = new Random();

        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(randomArray));
    }
}
