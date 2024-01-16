public class PartTimeEmployee extends Employee{
    private double perHour;
    private double totalTime;

    public PartTimeEmployee(String firstName, String lastName, double perHour, double totalTime) {
        super(firstName, lastName);
        this.perHour = perHour;
        this.totalTime = totalTime;
    }
@Override
    public double getSalary(){
        return this.totalTime*this.perHour;
    }
}




/*
свойство perHour (ставка за час)
свойство totalTime (кол-во отработанных часов)
метод getSalary (метод возвращает произведение отработанных часов и ставку)
 */