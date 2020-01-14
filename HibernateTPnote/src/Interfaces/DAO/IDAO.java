package Interfaces.DAO;

import java.util.List;

import exceptions.OwnerException;

public interface IDAO<T> {
	

	public abstract T create(T entity) throws Exception;

	public abstract void delete(T entity) throws Exception;
	
	public abstract T getById(int id) throws Exception;

	public abstract List<T> getAll();
	
	public abstract T update(T entity);
}


