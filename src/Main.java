import java.util.HashMap;
import java.util.Map;

public class Main {
    static Map<Integer,String> Employees = new HashMap<>();
    public static void main(String[] args) {
        Employees.put(1, "Ivan Ivanovich Ivanov");
        Employees.put(2, "Petor Petrovich Petrov");
        Employees.put(3, "Zahar Zaharovich Zaharov");
        Employees.put(4, "Pendos Pendosovich Pendosov");
        Employees.put(5, "Vasili Vasilievich Vasilev");

        System.out.println(Employees);
        addEmployee(6,"asdf asdf asdf");
        System.out.println(Employees);
        addEmployee(7,"asdf asdf asdf");
        System.out.println(Employees);
        dellEmployee("asdf asdf asdf");
        System.out.println(Employees);
        System.out.println(Employees.containsValue("Vasili Vasilievich Vasilev"));

        System.out.println(Employees);
    }

    public static void addEmployee(int id, String name) {
        if (!Employees.containsValue(name)) {
            Employees.put(id, name);
        }
    }

    public static void dellEmployee(String name) {
        boolean isExist = false;
        int i = 0;
        for (Map.Entry<Integer, String> employee : Employees.entrySet()) {
            if (employee.getValue().equals(name)) {
                isExist = true;
                i = employee.getKey();
                break;
            }
        }
        if (isExist) {
            Employees.remove(i);
        }
    }
}
