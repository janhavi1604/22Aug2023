package com.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Service;

import com.model.Item;

@Service
public class ItemService {
	 ArrayList<Item> itemList=new ArrayList();
	 
	  public void addItem(Item i)
	  {
		  itemList.add(i);
	  }
	  public ArrayList<Item> getItemList()
	  {
		  return itemList;
	  }
	  
	  public void updateItem(Item e)
	  {
		  
		  
		     Iterator<Item> iterator=itemList.iterator();
		     
		     while(iterator.hasNext())
		     {
		    	Item itm=iterator.next();
		    	if(itm.getItemId()==e.getItemId())
		    	{
		    		iterator.remove();
		    	}
		     }
		     
		     itemList.add(e);
		  
	  }
	  public void deleteItem(int id)
	  {
		  
		  Iterator<Item> iterator=itemList.iterator();
		     
		     while(iterator.hasNext())
		     {
		    	Item itm=iterator.next();
		    	if(itm.getItemId()==id)
		    	{
		    		iterator.remove();
		    	}
		     }
		  
	  }
	  
	  public Item getItem(int id)
	  {
		   return itemList.get(id);
	  }

}
