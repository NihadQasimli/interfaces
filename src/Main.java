public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new Logger[]{new DatabaseLogger(),new SmsLogger()});
        Customer customer = new Customer(3, "Aysel");
        customerManager.add(customer);

    }
}
