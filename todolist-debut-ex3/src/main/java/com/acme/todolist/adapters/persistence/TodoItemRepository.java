package com.acme.todolist.adapters.persistence;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.acme.todolist.domain.TodoItem;;

/**
 * DAO d'accès aux TodoItem
 * @author bflorat
 *
 */
public interface TodoItemRepository extends CrudRepository<TodoItem,String> {
	
	List<TodoItem> findAll(); 
	
	Optional<TodoItem> findById(String id);
	
	
}
