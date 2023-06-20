package after;

class Employee {
    private String id;
    private String name;
    private Position position;

    public Employee(String id, String name, Position position) {
        this.name = name;
        this.position = position;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Position getPosition() {
        return position;
    }

    
}