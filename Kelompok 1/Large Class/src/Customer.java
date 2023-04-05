public class Customer {
    private String name;
    private int age;
    private Credit credit;

    public Customer(String n, int a, Credit c) {
        name = n;
        age = a;
        credit = c;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setCredit(int c) {
        credit.setValue(c);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCredit() {
        return credit.getValue();
    }

    public boolean hasCredit() {
        return credit.getValue() > 0;
    }

    public boolean isAdult() {
        return age >= 18;
    }
}
