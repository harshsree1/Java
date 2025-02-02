package SectionNine;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] forthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(forthArray));
        //copy of array will creates new array, values get copies, it wont impact original array
        Arrays.sort(forthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(forthArray));
        //partial copy
        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));
        //copy and update the length of array
        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largerArray));

    }
    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++){
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

}
