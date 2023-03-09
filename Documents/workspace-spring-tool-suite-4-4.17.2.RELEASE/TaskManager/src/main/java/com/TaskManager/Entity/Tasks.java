package com.TaskManager.Entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tasks")
public class Tasks {
	
	       @Id
	       @Column(name="id")
           int id;
	       
	       @Column(name="name")
           String name;
	       
	       @Column(name="description")
           String description;
	       
	       @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	       @Column(name="date")
           Date dueDate;
           
	
        public Tasks() {}
		public Tasks(int id, String name, String description,Date dueDate) {
			
			this.id = id;
			this.name = name;
			this.description = description;
			this.dueDate = dueDate;
	
		}

		public Date getDueDate() {
			return dueDate;
		}

		public void setDueDate(Date dueDate) {
			this.dueDate = dueDate;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
}
