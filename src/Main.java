import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employee=new Employee[10];
        employee[0]=new Employee("Литвин Алексей Сергеевич","1",65300);
        employee[1]=new Employee("Жуков Андрей Витальевич", "1",67500);
        employee[2]=new Employee("Фанина Елена Потаповна","1",66750);
        employee[3]=new Employee("Зорина Римма Васильевна","2",75200);
        employee[4]=new Employee("Мартынов Петр Гаврилевич","2",74600);
        employee[5]=new Employee("Юрьевна Елизавета Родионовна","3",76450);
        employee[6]=new Employee("Гарин Елизар Сократович","3",78200);
        employee[7]=new Employee("Балтабева Яна Анатольевна","4", 86380);
        employee[8]=new Employee("Арсеньев Вадим Агапович","4", 88600);
        employee[9]=new Employee("Рудаков Антон Владимирович", "5",95800);

        System.out.println(Arrays.toString(employee));

        int totalSalary=0;
        for (int i = 0; i < employee.length; i++) {
            totalSalary += employee[i].getSalary();
        }
        System.out.printf("Сумма трат в месяц составила %s рублей.\n",totalSalary);

        int averageSalary=totalSalary/ employee.length;
        System.out.printf("Средняя зарплата составила %s рублей.\n",averageSalary);

        String maxFullName=employee[0].getFullName();
        String minFullName=employee[0].getFullName();
        int max = employee[0].getSalary();
        int min = employee [0].getSalary();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > max) {
                max = employee[i].getSalary();
                maxFullName=employee[i].getFullName();
            }else if (employee[i].getSalary()<min) {
                min = employee[i].getSalary();
                minFullName=employee[i].getFullName();
            }
        }
        System.out.printf("Максимальная зарплата составила %s рублей.\n"+"Минимальная зарплата составила %s рублей.\n",max,min);
        System.out.println("Сотрудник - "+maxFullName+", максимальная зарплата - "+max+".");
        System.out.println("Сотрудник - "+minFullName +", минимальная зарплата - "+min+".");

        for (int i = 0; i <employee.length ; i++) {
            System.out.println(employee[i].getFullName());
        }
    }
}