public class Employee {
    private  String fullName;
    private String departament;
    private  int salary;
    private int id;
    private static int count=0;

    public Employee(String fullName,String departament,int salary){
        this.fullName=fullName;
        this.departament=departament;
        this.salary=salary;
    }
    public String getFullName() {
        return this.fullName;
    }
    public String getDepartament(){
        return this.departament;
    }
    public int getSalary(){
        return this.salary;
    }
    public int getId(){
        return count=count+1;
    }
    public void setDepartament(String departament){
        this.departament=departament;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    @Override
    public String toString () {
        return "Ф.И.О. "+fullName+", отдел - "+departament+", зарплата - "+salary+", ID - "+getId();
    }



}
