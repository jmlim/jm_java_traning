package io.jmlim.java.traning.etc.deepcopy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionCloningTest {
    public static void main(String args[]) { // deep cloning Collection in Java
        List<Employee> org = new ArrayList<>();
        org.add(new Employee("MA", "Manager"));
        org.add(new Employee("AH", "Developer"));
        org.add(new Employee("JM", "Developer"));

        // creating copy of Collection using copy constructor

        List<Employee> copy = new ArrayList<>(org);

        System.out.println("ORG LIST : " + org);
        System.out.println("COPY LIST : " + copy);

        Iterator<Employee> itr = org.iterator();
        while (itr.hasNext()) {
            itr.next().setDesignation("Specialist");
        }

        //org list 에 해당하는 값을 바꿨으나 copy list 에 들어있는 객체값도 같이 바뀌게 된다.
        System.out.println("ORG LIST : " + org);
        System.out.println("COPY LIST : " + copy);


        //deep copy 로직
        List<Employee> deepCopy = new ArrayList<>(org.size());
        Iterator<Employee> iterator = org.iterator();
        while (iterator.hasNext()) {
            deepCopy.add(iterator.next().clone());
        }
        deepCopy.get(0).setDesignation("Expert");

        //deepCopy list 에 해당하는 값을 바꿨으나 org list 에 있는 객체값이 영향을 받지 않는다..
        System.out.println("ORG LIST : " + org);
        System.out.println("DEEP COPY LIST : " + deepCopy);

    }
}

class Employee implements Cloneable {
    private String name;
    private String designation;

    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s: %s", name, designation);
    }

    @Override
    protected Employee clone() {
        Employee clone = null;
        try {
            clone = (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return clone;
    }
}