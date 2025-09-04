package com.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.todo.dao.EntryDao;
import com.todo.entities.ListEntry;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class HomeController {
	
	@Autowired
	private EntryDao entryDao;
	
	@RequestMapping("/")
	public String home(Model model) {
		List<ListEntry> list= this.entryDao.getAllTask();
		model.addAttribute("lists",list);
		return "index";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		this.entryDao.delete(id);
		return "redirect:/";
	}
	
	@RequestMapping("/update/{id}")
	public String update(@PathVariable("id") int id,Model model) {
		
		ListEntry task=this.entryDao.getTask(id);
		model.addAttribute("task",task);
		return "update_form";
	}

	@RequestMapping("/addTask")
	public String addTask() {
		
		return "add_task";
	}
	
	
	@RequestMapping(path="/newForm",method=RequestMethod.POST)
	public RedirectView createTask(@ModelAttribute ListEntry entry,
							HttpServletRequest request,Model model) {
		RedirectView rv=new RedirectView();
		this.entryDao.createTask(entry);	
		rv.setUrl(request.getContextPath()+"/");
		return rv;
	}
	
	
}
