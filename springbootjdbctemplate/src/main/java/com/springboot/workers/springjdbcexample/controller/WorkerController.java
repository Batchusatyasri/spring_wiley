package com.springboot.workers.springjdbcexample.controller;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.workers.springjdbcexample.repository.Workerrepository;
import com.springboot.workers.springjdbcexample.model.Worker;

@RestController
@RequestMapping("/worker")
public class WorkerController {
	
	@Autowired
	Workerrepository workerRepo;
	
	@GetMapping("/showWorker")
	public Worker showWorker() {
		try {
			return workerRepo.getWorker(9);
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/all/showWorkers")
	public List<Worker> showWorkers(){
		try {
			return workerRepo.getWorkers();
		} catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/create")
	public String create() {
		try {
			Worker worker = new Worker(10, "Satyasri", "Batchu", 650000,Date.valueOf("2021-03-24"), "SDE", "bsatya@org.in");
			workerRepo.add(worker);
			return worker.getFirstName()+" Added Successfully";
		} catch(SQLException e) {
			e.printStackTrace();
			return "Error";
		}
	}
	
	@GetMapping("/update")
	public String update() {
		try {
			Worker worker = new Worker(10, "Satyasri", "Batchu", 70000,Date.valueOf("2022-07-21"), "SDE", "bat.satya@gmail.com");
			workerRepo.update(worker);
			return "Email updated successfully";
		} catch(SQLException e) {
			e.printStackTrace();
			return "Error";
		}
	}
	
	@GetMapping("/delete")
	public String delete() {
		try {
			workerRepo.delete(10);
			return "Record deleted successfully";
		} catch(SQLException e) {
			e.printStackTrace();
			return "Error while deleting the record";
		}
	}
}