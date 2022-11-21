package soaljavaweek;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }


    public static void main(String[] args) {
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        Employee employee2 = new Employee(8, "Peter", "Tan", 999);
        Employee employee3 = new Employee(8,"Peter", "Tan", 1098);

        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println("id is : "+ employee1.id);
        System.out.println("firstname is : " + employee1.firstName);
        System.out.println("lastname is : " + employee1.lastName);
        System.out.println("salary is : " + employee2.salary);
        System.out.println("name is : " + employee1.getName());
        System.out.println("annual salary is : " + employee2.getAnnualSalary());
        System.out.println(employee3.salary);
        System.out.println(employee3.toString());


    }

    private int getId(){
        return this.id;
    }
    private String getFirstName(){
        return this.firstName;
    }
    private String getLastName(){
        return this.lastName;
    }
    private String getName(){
        String fullName = firstName + " " + lastName;
        return fullName;
    }
    private int getSalary(){
        return this.salary;
    }
    private void setSalary (int salary){

    }
    private int getAnnualSalary(){
        return salary*12;
    }
    private int  raiseSalary (int percent){
        int newSalary = this.salary+ (percent/100);
        return newSalary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name=" + firstName + ' '+ lastName +
                ", salary=" + salary +
                ']';
    }
}

