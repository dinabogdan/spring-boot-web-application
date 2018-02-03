package com.freesoft.springboot.web.springbootwebapplication.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.freesoft.springboot.web.springbootwebapplication.model.Todo;

@Service
public class TodoService {

	private static List<Todo> TODOS = new ArrayList<>();
	private static int todoCount = 3;

	static {
		TODOS.add(new Todo(1, "Dina Bogdan", "JavaEE development without EJB", new Date(), false));
		TODOS.add(new Todo(2, "Dina Bogdan", "Spring Batch", new Date(), false));
		TODOS.add(new Todo(3, "Dina Bogdan", "Programming Kotlin", new Date(), false));
	}

	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<>();
		for (Todo todo : TODOS) {
			if (todo.getUser().equalsIgnoreCase(user)) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

	public Todo retriveTodo(int id) {
		for (Todo todo : TODOS) {
			if (todo.getId() == id) {
				return todo;
			}
		}
		return null;
	}

	public void updateTodo(Todo todo) {
		TODOS.remove(todo);
		TODOS.add(todo);
	}

	public void addTodo(String name, String desc, Date targetDate, Boolean isValid) {
		TODOS.add(new Todo(++todoCount, name, desc, targetDate, isValid));
	}

	public void deleteTodo(int id) {
		Iterator<Todo> iterator = TODOS.iterator();
		while (iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
	}
}
