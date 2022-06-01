import java.sql.SQLOutput;

public class ArraysLoops {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 4;
        a[1] = 74;
        a[3] = -7;
        a[4] = 1;
        System.out.println(a[2]);
        System.out.println(a[0] + a[3]);
        System.out.println(a.length);
        System.out.println(a[0] + a[a.length - 1]);
        System.out.println("------------");
        int[] array = {4, 5, 8, 6, 4};
        System.out.println(array[1]);
        System.out.println(array[array.length - 1]);
        System.out.println("------------");
        int[] c;
        c = new int[]{1, 5, 4};
        System.out.println("------------");
        int x = 0;
        if (x > 0) {
            System.out.println("possitive");

        } else {
            if (x < 0)
                System.out.println("non possitive");
            else
                System.out.println("Zero");
        }
        System.out.println("------------");
        int b;
        if (x > 0)
            b = 1;
        else b = 0;
        System.out.println(b);
        b = x > 0 ? 1 : -1;
        System.out.println(b);
        System.out.println(x > 0 ? "Possitive" : "Non Possitive");
        x = 1;
        System.out.println(x > 0 ? "Possitive" : x < 0 ? "Negative" : "Zero");
        System.out.println("------------");
        x = 5;
        switch (x) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
            case 5:
                System.out.println("Java");
                break;
            default:
                System.out.println("bigger");
        }
        System.out.println("------------");

        int counter = 1;
        while (counter < 11) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println("------------");
        x = 1;
        while (x <= 4) {
            System.out.println("Barev");
            x++;
        }
        System.out.println("------------");
        x = 1;
        do {
            System.out.println("Barev");
            x++;
        } while (x <= 4);
        System.out.println("------------");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        String[] numbers = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight"};
        for (int i = 0; i < numbers.length; i = i + 2) {
            System.out.println(numbers[i]);

        }
        System.out.println("------------");

        for (String s : numbers) {
            System.out.println(s);
        }
        System.out.println("------------");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
        System.out.println("------------");

        int[] array2 = {4, 5, 6, 7, -2, -7, 6};
        for (int element : array2) {
            if (element < 0) {
                System.out.println("ok");
                break;
            }
        }
        System.out.println("------------");
        for (int i = 1; i <=10; i++) {
            if(i==5)
                continue;
            System.out.println(i);
        }




    }
}
