package designpattern.dao;

import java.util.List;

public class PersonDaoImpl implements PersonDao {
	// Persistence context: 
	// DbUtils, EntityManager for JPA, etc

	@Override
	public Person save(Person person) {
		// persistenceContext will do the work
		return null;
	}

	@Override
	public void delete(int id) {
		// persistenceContext will do the work

	}

	@Override
	public Person findPersonById(int id) {
		// persistenceContext will do the work
		return null;
	}

	@Override
	public List<Person> findAll() {
		// persistenceContext will do the work
		return null;
	}

	@Override
	public Person update(Person person) {
		// persistenceContext will do the work
		return null;
	}

}
