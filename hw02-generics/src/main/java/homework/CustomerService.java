package homework;


import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomerService {

    //todo: 3. надо реализовать методы этого класса
    //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны

    private TreeMap<Customer, String> customers;

    public CustomerService() {
        customers = new TreeMap<>(Comparator.comparingLong(Customer::getScores).thenComparingLong(Customer::getId));
    }

    public Map.Entry<Customer, String> getSmallest() {
        Map.Entry<Customer, String> smallestEntry = customers.firstEntry();
        return smallestEntry == null ? null : new AbstractMap.SimpleEntry<>(new Customer(smallestEntry.getKey()),
                smallestEntry.getValue());
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Customer, String> nextEntry = customers.higherEntry(customer);
        return nextEntry == null ? null : new AbstractMap.SimpleEntry<>(new Customer(nextEntry.getKey()),
                nextEntry.getValue());
    }

    public void add(Customer customer, String data) {
        customers.put(customer, data);
    }
}
