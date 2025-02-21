package com.gym.model;

import org.springframework.data.annotation.Id; // Ensure spring-data-commons dependency is added to your project
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "persons") // MongoDB collection name
public class Person {
    @Id
    private String id;
    private String name;
    private int age;
    private String email;

    // Constructors
    public Person() {}

    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Person{id='" + id + "', name='" + name + "', age=" + age + ", email='" + email + "'}";
    }
}
