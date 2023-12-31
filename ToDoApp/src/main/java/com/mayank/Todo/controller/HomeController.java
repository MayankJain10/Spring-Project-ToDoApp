package com.mayank.Todo.controller;

import com.mayank.Todo.Entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletContext;
import java.util.Date;
import java.util.List;

/**
 * TO-DO Application
 * This is a basic desktop application, through this
 * you can make your daily TO-DO list.
 * You can add the points in this and can see the added points.
 */
@Controller
public class HomeController {
	
	@Autowired
	ServletContext context;
	
	@RequestMapping("/home")
	public String home(Model m) 
	{
		String name = "home";
		m.addAttribute("page", name);
		List<Todo>viewTodo=(List<Todo>)context.getAttribute("list");
		m.addAttribute("todos", viewTodo);
		return "home";
	}
	
	@RequestMapping("/add")
	public String addTodo(Model m)
	{
		Todo toDo = new Todo();
		m.addAttribute("page", "add");
		m.addAttribute("todo", toDo);
		return "home";
	}
	
	@RequestMapping(value="/saveTodo", method=RequestMethod.POST)
	public String saveTodo(@ModelAttribute("todo") Todo todo, Model m) {
		System.out.println(todo);
		todo.setToDoDate(new Date());
		
		// get the todo list from context
		List<Todo>todoList = (List<Todo>)context.getAttribute("list");
		todoList.add(todo);
		m.addAttribute("msg", "Successfully added..");
		return "home";
		
	}
}
