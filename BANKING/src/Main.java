import Entity.Customer;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
//    System.out.println("Hello World");
        Customer customer = new Customer();
        Customer customer1 = new Customer( 1, "MrBean");
        customer1.setName("Bill Gates");
        System.out.println("Id: " + customer1.getId() + "\nName: " + customer1.getName() + "\n");
        System.out.println(customer1);

        System.out.println("ID: ");
        int id = myObject.nextInt();
        customer.setId(id);
        System.out.println("Name: ");
        String name = myObject.next();
        customer.setName(name);
        System.out.println(customer);

        }
    }
