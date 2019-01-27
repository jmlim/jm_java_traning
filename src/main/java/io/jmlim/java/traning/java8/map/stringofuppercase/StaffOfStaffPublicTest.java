package io.jmlim.java.traning.java8.map.stringofuppercase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StaffOfStaffPublicTest {
    public static void main(String[] args) {
        List<Staff> staff = Arrays.asList(
                new Staff("jmlim", 30, new BigDecimal(10000)),
                new Staff("aehee", 27, new BigDecimal(20000)),
                new Staff("muksun", 33, new BigDecimal(30000))
        );

        //java 7
        List<StaffPublic> result7 = new ArrayList<>();

        for (Staff temp : staff) {

            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if ("muksun".equals(temp.getName())) {
                obj.setExtra("muksun babo");
            }

            result7.add(obj);
        }
        System.out.println(result7);
        System.out.println();
        //java 8
        List<StaffPublic> result8 = staff.stream().map(temp -> {
            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if ("muksun".equals(temp.getName())) {
                obj.setExtra("muksun babo 88888");
            }
            return obj;
        }).collect(Collectors.toList());
        System.out.println(result8);

    }
}
