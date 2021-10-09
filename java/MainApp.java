public class MainApp {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivanov@mail.ru", "87077777777", 10000, 20);
        employees[1] = new Employee("Pavel Trofimov", "Coder", "pavel@gmail.com", "87017777777", 15000, 45);
        employees[2] = new Employee("Vitaliy Krilov", "Builder", "vitaliy@mail.ru", "87095555555", 30000, 60);
        employees[3] = new Employee("Ernar Kabdrashev", "Teacher", "ernar@mail.ru", "87752222222", 11000, 54);
        employees[4] = new Employee("Andrey Pavlov", "Traveller", "andrey@mail.ru", "8705551550", 5000, 22);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                employees[i].printInfo();
            }
        }
    }
}

