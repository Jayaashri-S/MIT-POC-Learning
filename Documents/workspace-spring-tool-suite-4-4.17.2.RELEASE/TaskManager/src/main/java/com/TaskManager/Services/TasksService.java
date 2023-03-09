package com.TaskManager.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TaskManager.Entity.Tasks;
import com.TaskManager.Repository.TasksRepository;

@Service
public class TasksService {
	@Autowired
	private TasksRepository repos;
	
	public List<Tasks> getTasks() {
		// TODO Auto-generated method stub
		List<Tasks> list =new ArrayList<>();
		for(Tasks task:repos.findAll()){
			list.add(task);
		}
		System.out.println("Getting data from DB: "+ list);
		return list;
	}

	public Tasks getTask(int id){
		// TODO Auto-generated method stub
		return repos.findById(id).get();
		
	}

	public String addTask(Tasks listElement) {
		// TODO Auto-generated method stub
		repos.save(listElement);
		String s=" Added Successfully";
		return s;
	}

	public String updateTask(Tasks task, int id) {
		// TODO Auto-generated method stub
		repos.save(task);
		String s="Updated Successfully";
		return s;
	}

	public String deleteTask(int id) {
		// TODO Auto-generated method stub
	    repos.deleteById(id);
	    String s=" Deleted Successfully";
		return s;
	}

	
    
	

}
