public class CustomerManager {
    private Logger[] loggers;

    public CustomerManager() {

    }

    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    public void add(Customer customer) {
        System.out.println("Customer added! : " + customer.getName());
        Utils.runLogger(loggers,customer.getName());
    }


    public void delete(Customer customer) {
        System.out.println("Customer deleted! : " + customer.getName());
        Utils.runLogger(loggers,customer.getName());
    }

}
