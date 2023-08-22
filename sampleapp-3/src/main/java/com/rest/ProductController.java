package com.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.model.Item;
import com.model.ItemNotFoundException;
import com.model.Product;

import java.util.*;
@RestController
public class ProductController {
	/*
	@GetMapping("/item/{id}")
	public ResponseEntity<?> getProducts(@PathVariable int id)
	{
		Map<Integer,Item>mapitems=new HashMap();
		mapitems.put(1, new Item(1,"Cofee",20));
		mapitems.put(2,new Item(2,"Ice Tea",30));
		mapitems.put(3, new Item(3,"Expresso",50));
	
	
	if(!mapitems.containsKey(id))
	{
		throw new ItemNotFoundException("not found"+id);
	}
	else
	{
		return new ResponseEntity(mapitems.get(id),HttpStatus.OK);
	}
	}
	*/

	
	
	ArrayList<Product> productList=new ArrayList();
	
	public ProductController()
	{
		productList.add(new Product(1,"Cofee",20));
		productList.add(new Product(2,"Tea",50));
		productList.add(new Product(3,"ColdCofee",60));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getProduct(@PathVariable int id)
	{
		return new ResponseEntity(productList.get(id-1),HttpStatus.OK);
	}
	
	@PostMapping("/addproduct")
	public ResponseEntity<?> addProduct(@RequestBody Product product,UriComponentsBuilder comp)
	{
		productList.add(product);
		int id=product.getProductId();
		UriComponents componets=comp.path("/{"+id+"}").buildAndExpand(product.getProductId());
	     return new ResponseEntity(componets.toUri().toString(),HttpStatus.CREATED);
	
	}

}
