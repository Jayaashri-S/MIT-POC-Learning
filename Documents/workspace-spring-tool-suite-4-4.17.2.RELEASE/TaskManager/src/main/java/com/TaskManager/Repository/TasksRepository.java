package com.TaskManager.Repository;

import org.springframework.data.repository.CrudRepository;

import com.TaskManager.Entity.Tasks;

public interface TasksRepository extends CrudRepository<Tasks,Integer> {

}
