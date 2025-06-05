package oops;
// Encapsulation  = data hiding + Controlled acces via methods

class Employee {
    private int id;           // Data is hidden
    private String name;

    // Public getter
    public int getId() {
        return id;
    }

    // Public setter with validation
    public void setId(int id) {
        if (id > 0) this.id = id;
        else System.out.println("Invalid ID!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2) this.name = name;
        else System.out.println("Name too short!");
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setId(101);
        emp.setName("Nikhil");

        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());

        emp.setId(-1);  // triggers validation
        emp.setName("A");  // invalid
    }
}


