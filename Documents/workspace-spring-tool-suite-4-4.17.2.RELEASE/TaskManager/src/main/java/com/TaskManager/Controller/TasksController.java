package com.TaskManager.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.TaskManager.Entity.Tasks;
import com.TaskManager.Services.TasksService;

@RestController                             //Its used to create controllers for REST APIs which can return JSON
public class TasksController {
	
	@Autowired                        //automatic dependency injection- injects the object dependency implicitly
	private TasksService service;

	@RequestMapping("/tasks")            //helps to map web requests onto specific handler classes or methods.Can be Applied to controller class or methods. 
	public List<Tasks> getTasks(){
		return service.getTasks();
	}
	
	@RequestMapping("/tasks/{id}")
	public Tasks getTask(@PathVariable("id") int id){          //@PathVariable extract values from the URI Path whereas @RequestParams extract values from the query string
		return service.getTask(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/tasks")
	public String addTask(@RequestBody Tasks listElement) {          //@RequestBody is applied to handler methods of Controllers. It indicates that Spring should deserialize a request body into an object.
		 return service.addTask(listElement);                                                                             //@ResponseBody is used to convert object into HTTP response
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/tasks/{id}")
	public String updateTask(@RequestBody Tasks task,@PathVariable int id) {
	      return service.updateTask(task,id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/tasks/{id}")
	public String deleteTask(@PathVariable int id) {
	      return service.deleteTask(id);
	}
	
}
