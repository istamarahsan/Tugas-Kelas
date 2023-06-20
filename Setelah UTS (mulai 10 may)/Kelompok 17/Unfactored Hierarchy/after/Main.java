package after;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private static SubordinateRegistry subordinateRegistry;
    private static Map<String, Employee> employees = new HashMap<String, Employee>();

    public static void main(String[] args) {
        Employee ceo = new Employee("john", "John (CEO)", Position.Ceo);
        Employee manager1 = new Employee("mike", "Mike (Manager 1)", Position.Manager);
        Employee manager2 = new Employee("lisa", "Lisa (Manager 2)", Position.Manager);
        Employee employee1 = new Employee("alice", "Alice (Employee 1)", Position.Employee);
        Employee employee2 = new Employee("bob", "Bob (Employee 2)", Position.Employee);
        Employee employee3 = new Employee("eve", "Eve (Employee 3)", Position.Employee);
        
        employees.put(ceo.getId(), ceo);
        employees.put(manager1.getId(), manager1);
        employees.put(manager2.getId(), manager2);
        employees.put(employee1.getId(), employee1);
        employees.put(employee2.getId(), employee2);
        employees.put(employee3.getId(), employee3);

        subordinateRegistry = new SubordinateRegistry();

        subordinateRegistry.registerSubordinate(ceo.getId(), manager1.getId());
        subordinateRegistry.registerSubordinate(ceo.getId(), manager2.getId());
        subordinateRegistry.registerSubordinate(manager1.getId(), employee1.getId());
        subordinateRegistry.registerSubordinate(manager1.getId(), employee2.getId());
        subordinateRegistry.registerSubordinate(manager2.getId(), employee3.getId());


        // Traversing the hierarchy
        traverseHierarchy(ceo, 0);
    }
    public static void traverseHierarchy(Employee employee, int level) {
        StringBuilder indentation = new StringBuilder();
        for (int i = 0; i < level; i++) {
            indentation.append("  "); // Two spaces per level
        }
        
        System.out.println(indentation + employee.getName());

        var subordinates = subordinateRegistry.getSubordinatesOf(employee.getId())
            .stream()
            .map(id -> employees.get(id))
            .toList();
        
        for (Employee subordinate : subordinates) {
            traverseHierarchy(subordinate, level + 1);
        }
    }
}
