package demo.spring.springdemo;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Id;

@Data
@RequiredArgsConstructor
public class Ingredient {
    @Id
    private String id;
    private String name;
    private Type type;

    public Ingredient(String id, String name, Type type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public static enum Type{
        WRAP, PROTEINN, VEGGIES, CHEESE, SAUCE
    }
}
