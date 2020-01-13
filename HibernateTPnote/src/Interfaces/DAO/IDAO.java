package Interfaces.DAO;

import java.util.List;

public interface IDAO <T> {

	public abstract T create(T entity);

	public abstract void delete(T entity);

	public abstract void deleteById(int entityId);
	
	public abstract T searchById(int id);

	public abstract List<T> getAll();
}
