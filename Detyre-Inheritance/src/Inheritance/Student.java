package Inheritance;

public class Student
        extends Person {

    private int status;
    public final static int JUNIOR = 1;
    public final static int SENIOR = 2;

    public Student(String name, String address,
                   String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getStatus() {
        switch (status) {
            case 1:
                return "Junior";
            case 2:
                return "Senior";
            default:
                return "Unknown";
        }
    }


    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
}