package designpattern.dao;

import java.util.List;

public interface PersonDao {
	public Person save(Person person) ;
	public void delete(int id) ;
	public Person findPersonById(int id) ;
	public List<Person> findAll() ;
	public Person update(Person person) ;

}
