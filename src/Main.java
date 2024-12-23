import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] arrayInt = new int[]{1, 2, 3};
        float[] arrayFloat = {1.57f, 7.654f, 9.986f};
        char[] arrayString = {'a', 'b', 'c'};
        System.out.println("Задача 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(arrayInt[i]);
            if (i < 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(arrayFloat[i]);
            if (i < 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print(arrayString[i]);
            if (i < 2){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int i = 2; i != -1; i--) {
            System.out.print(arrayInt[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 2; i != -1; i--) {
            System.out.print(arrayFloat[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 2; i != -1; i--) {
            System.out.print(arrayString[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < 3; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i]++;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }
}