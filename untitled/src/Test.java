public class Test {
    public static void main(String[] args) {
        byte x = 4;
        int a = 127;
        x = (byte) a;
        System.out.println(x);

        x = (byte) (x + 1);
        System.out.println(x);

        x++;
        x += 5;

        x = 1;
        System.out.println(x + 5 + " Java");
        System.out.println("Barev " + (x + 5) + " Java");

        String s = "7";
        //  int a= (int)s; sxal
        int z = Integer.parseInt(s);
        System.out.println(z + 1);

        Student s1 = new Student();
        s1.setAge(40);
        s1.setName("Vahe");
        System.out.println(s1.getName());
        Student s2 = new Student();

        System.out.println(s2.getName());


        Student s3 = new Student("Vahe");
        Student s4 = new Student("Qristik", 29);
        System.out.println("----------------------");

        Car c = new Car("gggg");
        s1.sum(4, 5, 6);
        Teacher t1 = new Teacher();
        t1.setName("Vahe");
        t1.setYear(1982);
        t1.setSalary(1000);
        t1.setPhonNumber("620920");

        Administrator a1 = new Administrator();
        a1.setName("Qristine");
        a1.setYear(1993);
        a1.setDepartment("Agro");
        a1.setPhonNumber("250193");
        t1.printInfo();
        System.out.println("----------------------");
        a1.printInfo();


    }
}
