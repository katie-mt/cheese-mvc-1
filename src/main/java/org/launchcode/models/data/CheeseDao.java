package org.launchcode.models.data;

//Dao stands for data access object.
//Interface that will allow us to access cheese classes and will be the interface by which we interact with the database to store the cheese objects.
//Interface should extend the CrudRepository which is an interface that is part of the Spring framework data package.
//CredRepository is a parameterized interfaced that will store cheese objects and the keys of these cheese objects are integers.

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

//@Repository used to make SpringBoot aware of this CrudRepository (data access object).  @Repository tells Spring that this interface is a repository
// and that it should manage it for us - it is what enables Spring to create a concrete class that implements this interface
@Repository
//@Transactional specifies that all hte methods specified in this interface should be wrapped by a database transaction.
@Transactional
public interface CheeseDao extends CrudRepository <Cheese, Integer> {

}
