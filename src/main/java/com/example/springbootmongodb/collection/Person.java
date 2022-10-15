package com.example.springbootmongodb.collection;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "person")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
@Builder
public class Person {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private List<String> hobbies;
    private List<Address> addresses;
}
