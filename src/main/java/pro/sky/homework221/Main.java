package pro.sky.homework221;

public class Main {
    private static final Employee[] employees = {
            new Employee("Иванов Иван Иванович", 15000, 1),
            new Employee("Петров Петр Петрович", 10000, 1),
            new Employee("Сидоров Дмитрий Владимирович", 12000, 2),
            new Employee("Тухватуллин Тимур Игоревич", 20000, 2),
            new Employee("Александров Александр Александрович", 13000, 3),
            new Employee("Быков Олег Викторович", 11000, 3),
            new Employee("Акинин Геннадий Александрович", 17000, 4),
            new Employee("Басов Юрий Владимирович", 16000, 4),
            new Employee("Юрьев Сергей Петрович", 18000, 5),
            new Employee("Сарычев Аркадий Анатольевич", 19000, 5),

    };

    public static void main(String[] args) {
        printEmployees();
        System.out.println(" ");
        System.out.println("Сумма всех зарплат: " + totalSalary());
        System.out.println(" ");
        System.out.println("Минимальная зарплата: " + minSalary());
        System.out.println(" ");
        System.out.println("Максимальная зарплата: " + maxSalary());
        System.out.println(" ");
        System.out.println("Средняя зарплата: " + averageSalary());
        System.out.println(" ");
        printFullNames();

    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int totalSalary() {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        return salarySum;
    }

    public static Employee minSalary() {
        Employee employeeMinSalary = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() < employeeMinSalary.getSalary()) {
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    public static Employee maxSalary() {
        Employee employeeMaxSalary = employees[0];

        for (Employee employee : employees) {
            if (employee.getSalary() > employeeMaxSalary.getSalary()) {
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    public static float averageSalary() {
        return totalSalary() / (float) employees.length;
    }

    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}
