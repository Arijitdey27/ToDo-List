package com.todo.dao;

import java.util.List;

import com.todo.entities.ListEntry;

public interface EntryDao {

	public void createTask(ListEntry entry);

	public List<ListEntry> getAllTask();

	public void delete(int id);

	public ListEntry getTask(int id);
	

}
