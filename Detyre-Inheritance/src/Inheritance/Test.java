package Inheritance;

public class Test {
    public static void main(String[] args) {

        Person person = new Person("Birush", "Rr.101",
                "14733343199932", "birushsinani@gmail.com");

        Student student = new Student("Jakup", "Rr.101", "1531445999333234",
                "js28130@seeu.edu.mk", Student.SENIOR);

        Employee employee = new Employee("Sanije", "Rr.101", "1256189342324299",
                "ss15606@seeu.edu.mk", 805, 900);

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
    }
}
