package com.java;

import com.java.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class Java8InterviewProgramsApplication {

    public static void main(String[] args) {

        SpringApplication.run(Java8InterviewProgramsApplication.class, args);

        List<Employee> employeeList = Stream.of(
                new Employee(1, "ketul", "patel", "ahmedabad", "1234567890", 37),
                new Employee(2, "sweeti", "patel", "ahmedabad", "1234567890", 37)
        ).collect(Collectors.toList());

        employeeList.stream().forEach(e -> System.out.println(e));

        String str = "iloveyoujavatechie";
        String[] strArray = str.split("");
        Map<String, Long> alphabetCount = Arrays.stream(strArray)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(alphabetCount);

    }

}
