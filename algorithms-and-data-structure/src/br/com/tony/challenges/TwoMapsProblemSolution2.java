package br.com.tony.challenges;

import java.util.ArrayList;
import java.util.List;

public class TwoMapsProblemSolution2 {
    public static void main(String[] args) {
        List<BaseClass2> baseClasses = new ArrayList<>();
        baseClasses.add(new ChildClassA_2(2, "123", "InsufficientFund"));
        baseClasses.add(new ChildClassB_2(1, "123", "John Doe"));
        System.out.println(baseClasses);

        List<Dto> dtos = new ArrayList<>();

        baseClasses.forEach(base -> {
            if (base.type == 2) {
                ChildClassA_2 childClassA2 = (ChildClassA_2) base;
                dtos.add(new Dto(childClassA2.id, childClassA2.reasonCode, ""));
            }
            
        });


    }
}

record Dto(String id, String reasonCode, String customerName) {}

class BaseClass2 {
    int type;

    public BaseClass2(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}

class ChildClassA_2 extends BaseClass2 {
    String reasonCode;
    String id;

    public ChildClassA_2(int type, String id, String reasonCode) {
        super(type);
        this.id = id;
        this.reasonCode = reasonCode;
    }

    public String getId() {
        return id;
    }

    public String getReasonCode() {
        return reasonCode;
    }
}

class ChildClassB_2 extends BaseClass2 {
    String id;
    String customerName;

    public ChildClassB_2(int type, String id, String customerName) {
        super(type);
        this.id = id;
        this.customerName = customerName;
    }

    public String getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }
}