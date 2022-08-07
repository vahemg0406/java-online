import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Human h = new Human();
        h.year = 2022;

        Human h1 = new Human();
        h1.year = 1982;
        System.out.println(h.year);
        System.out.println(h1.year);
        System.out.println(Human.count);
        System.out.println(Human.a);
        Student s1 = new Student("Vahe");
        s1.sum(4, 5);
        Student s2 = new Student("q");
        s2.sum(4, 5);
        Student.sum(4, 6);


        String s="7";
        int a= Integer.parseInt(s);
        System.out.println(a+1);

        char c='a';
        System.out.println(Character.isUpperCase(c));
        String pass =" asDFG 45";
int count=0;
        for (int i = 0; i <pass.length(); i++) {
            if(Character.isUpperCase(pass.charAt(i))){
                count++;
            }
        }
        System.out.println(count);

        System.out.println(Integer.MAX_VALUE);

    }
}
