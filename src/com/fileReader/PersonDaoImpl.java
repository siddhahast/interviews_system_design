package com.fileReader;

public class PersonDaoImpl implements PersonDao<Person>{

	@Override
	public void save(Person person) {
		// TODO : Complete the database setup to store the data in a database instance
		
		System.out.println(person.toString());
		
	}

}
