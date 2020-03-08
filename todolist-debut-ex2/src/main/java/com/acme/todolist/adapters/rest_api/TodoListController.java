package com.acme.todolist.adapters.rest_api;

import java.util.List;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.acme.todolist.application.port.in.AddTodoItem;
import com.acme.todolist.application.port.in.GetTodoItems;
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
	
	
	private GetTodoItems getTodoItemsQueryService;
	private AddTodoItem addTodoItem;
	
	@Inject
	public TodoListController(GetTodoItemsService getTodoItemsQueryService, AddTodoItem addTodoItem ) {
		this.getTodoItemsQueryService = getTodoItemsQueryService;
		this.addTodoItem = addTodoItem;
	}
	
	@GetMapping("/todos")
	public List<TodoItem> getAllTodoItems() {
		return this.getTodoItemsQueryService.getAllTodoItems();
	}
	
	@PostMapping("/todos")
	public void addTodoItem(@RequestBody TodoItem item) {
		this.addTodoItem.addTodoItem(item);
	}


}
