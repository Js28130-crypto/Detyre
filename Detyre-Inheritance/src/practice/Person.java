package practice;
class Person {
    private double id;
    private String name;

    public Person(){
        //onlu person class can access and assign
        id=Math.random();
        sayHello();
    }

    //this method is protected for giving access within person class only
    private void sayHello(){
        System.out.println("Hello - "+getId());
    }
    public double getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public static class Abstrction{
        public static void main(String[] args) {
            Person p1=new Person();
            p1.setName("Jakup");

            System.out.println("Person 1 - "+ p1.getId()+" : "+p1.getName());
        }
    }
}
