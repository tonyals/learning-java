package br.com.tony.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class SetAddressChallenge {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("1"),
                new Person("2"),
                new Person("3")
        );
        List<Address> addresses = List.of(
                new Address("1", "Rua 1"),
                new Address("2", "Rua 2"),
                new Address("3", "Rua 3")
        );


        Map<String, List<Address>> addressMap = addresses.stream()
                .collect(Collectors.groupingBy(address -> address.personId));

        personList.forEach(person -> person.setAddresses(addressMap.get(person.id)));

        System.out.println(personList);

    }
}

class Person {
    String id;
    List<Address> addresses = new ArrayList<>();

    public Person(String id) {
        this.id = id;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", addresses=" + addresses +
                '}';
    }
}

class Address {
    String personId;
    String street;

    public Address(String personId, String street) {
        this.personId = personId;
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "personId='" + personId + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}