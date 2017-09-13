package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by LaunchCode
 */
//class that we want to be able to store in our database (our model class).
// We want to make this persistent (stored in the database outside the application

//Annotation flags SpringBoot that we want to store this class in the database
//Every field within this class (name, description, cheesetype) will be stored within a table in the database unless otherwise specified
@Entity
public class Cheese {

    //These two annotations together say that the ID field should be a primary key column in the database
    @Id
    //hibernate (data layer) should generate that value for us and manage the value creation
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=3, max=15)
    private String name;

    @NotNull
    @Size(min=1, message = "Description must not be empty")
    private String description;

    private CheeseType type;

    public Cheese(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //Hibernate uses this constructor
    public Cheese() { }

    //getter for the ID (not making a setter because this value shouldn't be able to be changed)
    public int getId() {
        return id;
    }

    //getters and setters for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //getters and setters for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //getters and setters for CheeseType
    public CheeseType getType() {
        return type;
    }

    public void setType(CheeseType type) {
        this.type = type;
    }
}
