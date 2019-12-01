package com.xyz.todolist.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ToDoListOperations {

	public static  ArrayList<ToDoList> list =new ArrayList<>();
	public  void  add(ToDoList todo) {
	list.add(todo);
	System.out.println("List is"+list);
}
	

public boolean delete(int id) {
	int index = search(id);
	if (index >=0) {
		list.remove(index);
		return true;
	}
	return false;
}

private int search(int id) {
	ToDoList todo = new ToDoList();
	todo.setId(id);
	int index = list.indexOf(todo);
	return index;
}


public void search() {
	
}

public void update() {
	
}
public void sort() {
	Collections.sort(list);
}
public void showFinish() {
	
}
public void showPending() {
	
}
public void countFinish() {
	
}
public void countPending() {
	
}

}
