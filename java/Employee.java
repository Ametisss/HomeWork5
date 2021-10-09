public class Employee {
    private String name;
    private String post;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Employee(String name, String post, String email, String number, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;
    }



    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println("name:" + name + " " + "post:" + post + " " + "email:" + email + " " + "number:" + number + "" + "salary:" + salary + " " + "age:" + age);
    }
}


