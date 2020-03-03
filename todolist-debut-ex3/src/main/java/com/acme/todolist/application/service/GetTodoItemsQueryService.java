package com.acme.todolist.application.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.acme.todolist.application.port.in.GetTodoItemsQuery;
import com.acme.todolist.application.port.out.LoadTodoItem;
import com.acme.todolist.domain.TodoItem;

@Component
public class GetTodoItemsQueryService implements GetTodoItemsQuery {

		
	private LoadTodoItem loadTodoItem;
	
	@Inject
	public GetTodoItemsQueryService(LoadTodoItem loadTodoItem) {
		this.loadTodoItem = loadTodoItem;
		
	}

	@Override
	public List<TodoItem> getAllTodoItems() {
		return this.loadTodoItem.loadAllTodoItems();
	}

}
