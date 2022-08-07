public class Human {
    private String name;
    private int year;
    private String phonNumber;

    public String getPhonNumber() {
        return phonNumber;
    }

    public void setPhonNumber(String phonNumber) {
        this.phonNumber = phonNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printInfo(){
        System.out.println("Name " + name);
        System.out.println("Year " + year);
        System.out.println("Phone " + phonNumber);

    }


}
