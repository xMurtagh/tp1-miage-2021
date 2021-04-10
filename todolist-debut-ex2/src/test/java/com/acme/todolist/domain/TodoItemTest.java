/**
 * 
 */
package com.acme.todolist.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

/**
 * @author tp
 *
 */
class TodoItemTest {
	
	private TodoItem todoItem;

	@Test
	void isLateTestCasDateInférieure24H() {
		// Init
		Date date = new GregorianCalendar(2100, 2, 2).getTime();
		this.todoItem = new TodoItem(null, date.toInstant(), null);
		
		// Act
		boolean result = todoItem.isLate();
		
	}
	
	@Test
	void isLateTestCasDateSupérieur24H() {
		// Init
		Date date = new GregorianCalendar(2000, 2, 2).getTime();
		this.todoItem = new TodoItem(null, date.toInstant(), null);
		
		// Act
		boolean result = todoItem.isLate();
		
		// Assert
		assertTrue(result);
	}
	
	@Test
	void isLateTestCasDateNull() {
		// Init
		this.todoItem = new TodoItem(null, null, null);
		
		// Act
		assertThrows(NullPointerException.class, () -> {
			todoItem.isLate();
		});
		
	}

}
