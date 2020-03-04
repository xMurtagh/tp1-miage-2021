package com.acme.todolist.adapters.rest_api;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.todolist.application.service.GetTodoItemsService;
import com.acme.todolist.domain.TodoItem;

/**
 * Le controlleur Spring MVC qui expose les endpoints REST
 * 
 * @author bflorat
 *
 */
@RestController
public class TodoListController {
	
	
	private GetTodoItemsService getTodoItemsQueryService;
	
	
	@Inject
	public TodoListController(GetTodoItemsService getTodoItemsQueryService) {
		this.getTodoItemsQueryService = getTodoItemsQueryService;
	}
	
	@GetMapping("/todos")
	public List<TodoItem> getAllTodoItems() {
		return this.getTodoItemsQueryService.getAllTodoItems();
	}


}
