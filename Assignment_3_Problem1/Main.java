package Assignment_3_Problem1;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alexander", "Oblego", "123-456");
        Customer c2 = new Customer("Paul", "Jones", "456-123");
        Customer c3= new Customer("Jude", "James", "456-789");

        Address a1 = new Address("4th Street", "Chicago", "Iowa", "52557");
        Address a2 = new Address("5th Street", "Seattle", "Denver", "43566");
        Address a3 = new Address("6th Street", "Des Moine", "Baltimore", "76899");

        c1.setBillingAddress(a1);
        c1.setShippingAddress(a2);

        c2.setBillingAddress(a3);
        c2.setShippingAddress(a3);

        c3.setBillingAddress(a1);
        c3.setShippingAddress(a2);

        Customer [] customer = {c1,c2,c3};
        for (Customer customers : customer) {
            if (customers.getBillingAddress().getCity().equals("Chicago")){
                System.out.println(customers);
            }
        }
    }
}
