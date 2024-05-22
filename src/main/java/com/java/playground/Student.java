package com.java.playground;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    private String fName;

    private String lName;

    private String department;

    private int rank;

    private List<Integer> mobileNo;

}
