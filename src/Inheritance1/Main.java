package Inheritance1;



public class Main {
    public static void main(String[] args) {
        Laptop skolePc = new Laptop(true, 18, "Samsung", 52);
        SmartPhone workPhone = new SmartPhone(true, 5, "Apple", "Joe");

        workPhone.showModel();
    }
}
