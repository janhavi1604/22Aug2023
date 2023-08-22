package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.model.Item;
import com.service.ItemService;

@RestController
public class ItemController {
	
	@Autowired
	ItemService service;
	
	@GetMapping("/items")
	public ArrayList<Item> getEmployeeS()
	{
		return service.getItemList();
	}
	
	@PostMapping("/additem")
	public ResponseEntity<String> addEmployee(@RequestBody Item i)
	{
		service.addItem(i);
		return new ResponseEntity<>("Employee Added",HttpStatus.CREATED);
	}
	
	@PatchMapping("/updateitem")
	public ResponseEntity<String >updateEmployee(@RequestBody Item i)
	{
		service.updateItem(i);
		return new ResponseEntity<String>("Entity updated",HttpStatus.OK);
	}
	@DeleteMapping("/deleteitem/{id}")
	@ResponseStatus(value=HttpStatus.ACCEPTED,reason="resource deleted")
	public void deleteEmployee(@PathVariable int id)
	{
		service.deleteItem(id);
	}

}
