package com.todo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.todo.entities.ListEntry;

@Repository
public class EntryDaoImpl implements EntryDao{
	
	 @Autowired
	 private HibernateTemplate ht;


	@Transactional
	@Override
	public void createTask(ListEntry entry) {
		this.ht.saveOrUpdate(entry);
		
	}


	@Override
	public List<ListEntry> getAllTask() {
		List<ListEntry> list=this.ht.loadAll(ListEntry.class);
		return list;
	}


	@Transactional
	@Override
	public void delete(int id) {
		ListEntry l=this.ht.get(ListEntry.class,id);
		this.ht.delete(l);
		
	}


	@Override
	public ListEntry getTask(int id) {
		ListEntry task=this.ht.get(ListEntry.class, id);
		return task;
		
	}
	
	

}
