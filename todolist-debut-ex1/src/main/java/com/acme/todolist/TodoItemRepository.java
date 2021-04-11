package com.acme.todolist;

import java.util.List;
import java.util.Optional;

import javax.inject.Named;

import org.springframework.data.repository.CrudRepository;;

/**
 * DAO d'accès aux TodoItem
 * @author bflorat
 *
 */
// Afin de permettre à la classe d'être gérée par SPRING, il faut la "nommée"
@Named
public interface TodoItemRepository extends CrudRepository<TodoItem,String> {
	
	List<TodoItem> findAll(); 
	
	Optional<TodoItem> findById(String id);
	
	
}
