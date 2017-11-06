
public class Manager extends Person{
    double salary;
    public Manager(String u, String p){
        username = u;
        password = p;
        salary = 50;
    }//end constructor
    public double getSalary(){
        return salary;
    }
}
