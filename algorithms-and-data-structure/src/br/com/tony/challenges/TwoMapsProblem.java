package br.com.tony.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoMapsProblem {
    public static void main(String[] args) {
        ArrayList<BaseClass> baseClasses = new ArrayList<>();
        baseClasses.add(new ChildClassA("123", "InsufficientFund"));
        baseClasses.add(new ChildClassB("123", "John Doe"));
        System.out.println(baseClasses);

        Map<String, List<BaseClass>> collected = baseClasses.stream().collect(Collectors.groupingBy(BaseClass::getId));
        System.out.println(collected);
    }
}

class BaseClass {
    String baseClass;
    String id;

    public BaseClass(String id) {
        this.id = id;
    }

    public String getBaseClass() {
        return baseClass;
    }

    public String getId() {
        return id;
    }
}

class ChildClassA extends BaseClass {
    String reasonCode;

    public ChildClassA(String id, String reasonCode) {
        super(id);
        this.id = id;
        this.reasonCode = reasonCode;
    }

    public String getReasonCode() {
        return reasonCode;
    }
}

class ChildClassB extends BaseClass {
    String id;
    String customerName;

    public ChildClassB(String id, String customerName) {
        super(id);
        this.id = id;
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }
}