package com.java.model;

import java.util.Optional;

public record Employee(int id,
                       String firstName,
                       String lastName,
                       String address,
                       String phone,
                       int age) {
}
