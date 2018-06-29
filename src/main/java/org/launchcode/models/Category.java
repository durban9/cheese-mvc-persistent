package org.launchcode.models;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15, message = "The entry for the category must be between three and fifteen characters.")
    private String name;

    @OneToMany
    @JoinColumn (name = "category_id")
    private List<Cheese> cheeses=new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Category(){

    }

    public Category(String name){

    }
}
