package com.acme.todolist.adapters.rest_api;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acme.todolist.application.service.GetTodoItemsQueryService;
import com.acme.todolist.domain.TodoItem;

/**
 * Le controlleur Spring MVC qui expose les endpoints REST
 * 
 * @author bflorat
 *
 */
@RestController
public class TodoListController {
	
	
	private GetTodoItemsQueryService getTodoItemsQueryService;
	
	
	@Inject
	public TodoListController(GetTodoItemsQueryService getTodoItemsQueryService) {
		this.getTodoItemsQueryService = getTodoItemsQueryService;
	}
	
	/*
	@PostMapping("/todos")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createTodoItem(@RequestBody TodoItem todoItem) {
		this.getTodoItemsQueryService.save(map todoItem);
	}
*/
	

	@GetMapping("/todos")
	public List<TodoItem> getAllTodoItems() {
		return this.getTodoItemsQueryService.getAllTodoItems();
	}


}
