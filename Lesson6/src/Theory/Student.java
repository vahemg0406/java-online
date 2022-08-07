package Theory;

public class Student extends Human{
    private double midMark;

    public Student(String name) {
        super(name);
    }
    public double getMidMark() {
        return midMark;
    }

    public void setMidMark(double midMark) {
        this.midMark = midMark;
    }
}
