
public class Employee extends Person {
    double salary;
    public Employee(String u, String p) {
        username = u;
        password = p;
        salary = 13.5;
    }//end constructor
    public double getSalary(){
        return salary;
    }
}//end class
