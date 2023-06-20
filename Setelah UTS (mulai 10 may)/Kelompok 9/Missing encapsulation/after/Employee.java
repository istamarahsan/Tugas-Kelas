
public class Employee {

    private String name;
    private String gender;
    private int age;
    private double salary;
    
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public double getSalary() {
        return salary;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double salaryIncrease (double amount){
        if(this.salary > 0){
            this.salary += amount*0.8;
        }else if(this.salary > 500){
            this.salary += amount*0.6;
        }else{
            this.salary += amount*0.4;
        }
        return salary;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.gender);
        System.out.println("Salary: " + this.age);
        System.out.println("Salary: " + this.salary);
    }
}
