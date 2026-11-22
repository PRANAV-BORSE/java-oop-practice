package example.dao;

public interface AppDao<T, ID> {
	//METHODS FOR HANDLING CRUD OPERATION
	T getById(ID identity);
	//void create(T t);
	//Collection<T> getAll();
	//void deleteById(ID identity);
	//void update(T updateData);
	
}
