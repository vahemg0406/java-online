import java.util.Arrays;

public class ArraysLab {
    public static void main(String[] args) {
        System.out.println("Print numbers 1 to 15");
        for (int i = 1; i < 16; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nPrint even numbers -10 to 20");
        for (int i = -10; i <= 20; i = i + 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = -10; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println("\nprint * symboles using given number");
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nprint * symboles using given number in reverse mode");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n Create an array with 1-11");

        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n Create an array with even numbers from -10 to 10");
        int[] array2 = new int[11];
        for (int i = 0, j = -10; i < array.length; i++, j = j + 2) {
            array2[i] = j;
        }
        for (int i : array2) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n Given an array. print odd elements");
        int[] array3 = {4, 9, 5, 3, 1, 2, 4, 6, 85, 91, 44, 66};
        for (int a : array3) {
            if (a % 2 != 0)
                System.out.print(a + " ");
        }
        System.out.println("\n\n Given an array. print elements fro -10 to 5");
        int[] array4 = {4, -9, 5, -3, 1, 2, 4, -6, 85, 91, 44, 66};
        for (int a : array4) {
            if (a >= -10 && a <= 5)
                System.out.print(a + " ");
        }
        System.out.println("\n\n Given an array. print elements which can divided 3 or 4");
        int[] array5 = {4, 9, 5, 3, 1, 2, 4, 6, 85, 91, 44, 66};
        for (int a : array4) {
            if (a % 3 == 0 || a % 4 == 0)
                System.out.print(a + " ");
        }
        System.out.println("\n\n Given an array. print count of even elements");
        int countOfEvens = 0;
        int[] array6 = {4, 9, 5, 3, 1, 2, 4, 6, 85, 91, 44, 66};
        for (int a : array6) {
            if (a % 2 == 0)
                countOfEvens++;
        }
        System.out.print("Count Of Even elements " + countOfEvens);

        System.out.println("\n\n Given an array. print sum of elements");
        int[] array7 = {4, -9, 5, 3, -1, 2, 4, -6, 85, -9,};
        int sum = array7[0];
        for (int i = 1; i < array7.length; i++) {
            sum = sum + array7[i];
        }
        System.out.println("sum of elements " + sum);

        System.out.println("\n\n Given an array. print sum of possitiv elements");
        int sumOfPossitiv = 0;
        for (int i = 0; i < array7.length; i++) {
            if (array7[i] > 0) {
                sumOfPossitiv = sumOfPossitiv + array7[i];
            }
        }
        System.out.println("sum of possitiv elements " + sumOfPossitiv);


        System.out.println("\n\n Given an array. print   of multiplication possitiv elements");
        int[] array8 = {4, 9, 5, 3, -1, 2, 4, -6, 8, -9,};
        int multOfPossitiv = 1;
        for (int i = 0; i < array7.length; i++) {
            if (array8[i] > 0) {
                multOfPossitiv = multOfPossitiv * array8[i];
            }
        }
        System.out.println("Multiplication of possitiv elements " + multOfPossitiv);


        System.out.println("\n\n Find maximal element from array");
        int max = array8[0];
        for (int i = 1; i < array8.length; i++) {
            if (array8[i] > max)
                max = array8[i];
        }
        System.out.print("max " + max);


        System.out.println("\n\n Find minimal element from array");
        int min = array8[0];
        for (int i = 1; i < array8.length; i++) {
            if (array8[i] < min)
                min = array8[i];
        }
        System.out.print("minimum " + min);

        System.out.println("\n\n Find element which is alone");
        int[] array9 = {4, 2, 1, 9, 2, 1, 4};
        int result = array9[0];
        for (int i = 1; i < array9.length; i++) {
            result = result ^ array9[i];
        }
        System.out.println(result);


        int x = 4, y = 3;
        int z = x;
        x = y;
        y = z;
        System.out.println("x=" + x + " y=" + y);

        System.out.println("\n\n Sort array in asc.");
        int[] array10 = {4, 19, 5, 3, -1, 2, -4, -6, 8, -9,};
        for (int a : array10) {
            System.out.print(a + " ");
        }
int counOfFors=0;
        boolean qaniDerIfMtnume = true;
        while (qaniDerIfMtnume) {
            qaniDerIfMtnume = false;
            for (int i = 0; i < array10.length - 1-counOfFors; i++) {
                if (array10[i] > array10[i + 1]) {
                    int j = array10[i];
                    array10[i] = array10[i + 1];
                    array10[i + 1] = j;
                    qaniDerIfMtnume = true;
                }
            }
            counOfFors++;
        }
        System.out.println();
        for (int a : array10) {
            System.out.print(a + " ");
        }


    }
}
