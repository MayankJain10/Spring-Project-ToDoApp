package com.mayank.Todo.Entities;

import java.util.Date;

public class Todo {
	
	private String toDoTitle;
	
	private String toDoContent;

	private Date toDoDate;

	public Todo(String toDoTitle, String toDoContent, Date toDoDate) {
		super();
		this.toDoTitle = toDoTitle;
		this.toDoContent = toDoContent;
		this.toDoDate = toDoDate;
	}
	
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getToDoTitle() {
		return toDoTitle;
	}

	public void setToDoTitle(String toDoTitle) {
		this.toDoTitle = toDoTitle;
	}

	public String getToDoContent() {
		return toDoContent;
	}

	public void setToDoContent(String toDoContent) {
		this.toDoContent = toDoContent;
	}

	public Date getToDoDate() {
		return toDoDate;
	}

	public void setToDoDate(Date toDoDate) {
		this.toDoDate = toDoDate;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getToDoTitle()+" : "+ this.toDoContent;
	}
	
	
	

	
}
