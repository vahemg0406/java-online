public class Operations {
    public static void main(String[] args) {
        int a=21, b=9;
        int c=a+b;
        System.out.println(c);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        double p=8; double r=5;
        System.out.println(p/r);

        a=6;
        a=a+1;
        a++;
        System.out.println(a);


       int x=4;
        System.out.println(++x);
        System.out.println(x);


        x=3; int y=6;
        int z= x++ - --y;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("--------------------");
        boolean h=x==4;
        System.out.println(h);
        System.out.println(x!=45);
        System.out.println(x!=4);
        System.out.println(x>=2);

        x=5;
        System.out.println(x%2==0);
        System.out.println("--------------------");

        x=5;
        y=8;
        System.out.println(x>=1 && x<=4);
        System.out.println(x>=1 || x<=4);

        boolean vv=false;
        System.out.println(!vv);

        System.out.println(x>=1 && (x<=9 || x<-1));
        System.out.println("--------------------");
        System.out.println(5&8);
        System.out.println(17&24);
        System.out.println(5|8);
        System.out.println(5^8);


        x=8;
        x+=2;
        System.out.println(x);


    }
}
