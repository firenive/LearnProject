package Myrusakov.Chapter3_OOP.Extends.Lect;

public class Worker extends PersonExtends {
    private int salary = 0;
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public  int getSalary(){
        return salary;
    }
    public String getTextInfo() {
        String s = super.getTextInfo();
        s += "; Размер зарплаты: " + this.salary + " рублей";
        return s;
    }

}
