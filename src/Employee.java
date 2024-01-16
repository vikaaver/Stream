abstract public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String info (){
        return String.format("%s %s", this.firstName, this.lastName);
    }
    abstract public double getSalary();

    }

