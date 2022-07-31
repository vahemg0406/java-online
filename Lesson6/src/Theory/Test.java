package Theory;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // String st=s.next(); minchev prabel ktpi
        s.nextLine(); // naxoroq kanchum enq funkcian vor nor toxic sksvi
        String st = s.nextLine();
        System.out.println(st);

        System.out.println("----------");
        Student s1 = new Student("Vahe");
        System.out.println(s1.getName());

        Human human = new Human("Qoso");
        System.out.println(human);//System.out.println(human.toString())
        System.out.println(human.toString());
    }
}
