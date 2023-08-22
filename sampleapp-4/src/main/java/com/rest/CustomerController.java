package com.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.model.Customer;
import com.model.CustomerLengthNotFoundException;
@RestController
public class CustomerController {
	
	/*@GetMapping("/customer/{id}")
	public ResponseEntity<?> getCustomer(@PathVariable int id)
	{
	   Map<Integer,Customer> mapitems=new HashMap();
		
		mapitems.put(1, new Customer(1,"Peter","James"));
		mapitems.put(2, new Customer(2,"Sam","Cummins"));
		mapitems.put(3, new Customer(3,"Max","George"));
		
		/*if(!mapitems.containsKey(id))
		{
			throw new CustomerLengthNotFoundException("not found"+id);
		}
		else
		{
			return new ResponseEntity(mapitems.get(id),HttpStatus.OK);
		}
		
		   
		
	}*/
		


	@PostMapping("/addcustomer")
	  public ResponseEntity<String> addCustomer(@RequestBody Customer c) 
	  {
		
			
	   if(c.getFirstName().length()<3) 
	 { 
	        throw new CustomerLengthNotFoundException("not in length found");
	 }  else
	 { 
	 return new ResponseEntity("customer added",HttpStatus.CREATED);
	 } 
	   
	   /*@GetMapping("/getallproducts")
	   public ResponseEntity<?> getallproducts(UriComponentsBuilder uricomp)
	   {
		   ArrayList<String> resourceList=new ArrayList<>(); 
		   for(Customer p:customerList)
		   {
			   
			   int id=p.getProductId();
			   UriComponents components=uricomp.path("/"+id+"}").build(id);
			   resourceList.add(componets.toUri().toString());
			   
		   }
		   
		   return new ResponseEntity<>(resourseList,HttpStatus.OK);
	   }
	 } */
}
}
