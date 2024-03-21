package com.java.model;

import java.util.List;

public record Student(int id,
                      String firstName,
                      int age,
                      String gender,
                      String department,
                      String city,
                      int rank,
                      List<String> contacts
) {
}
