package com.tsg.swift.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tsg.swift.dao.ItemRepository;
import com.tsg.swift.dao.KitchenRepository;
import com.tsg.swift.dto.Kitchen;
import com.tsg.swift.dto.KitchenItem;
import com.tsg.swift.dto.Response;




@RestController
public class KitchenController {

	
	@Autowired
	private KitchenRepository orderRepository;
	@Autowired
	private ItemRepository itemRepository;
	


	
	@GetMapping("/kitchen")
	public List getAllKitchen() {
		List findAllOrder = orderRepository.findAll();
	    return findAllOrder;
	}
	
	@GetMapping("/kitchendetails")
	public String getKitchenDetails() {
	    return "Kitchen Details are returned";
	}
	
	@PostMapping("/kitchen")
	public Response createKitchen(@RequestBody Kitchen order) {
		List<KitchenItem> items1 =order.getItems();
	    //List<Guests> table1 =order.getGuests();
	     orderRepository.save(order);
	     Response response = new Response();
		   response.setId(order.getId());
		   response.setMessage("Success");
		   return response;
	}
	

	  @GetMapping("/kitchen/order/{orderid}")
	  public Optional<Kitchen> getKitchen(@PathVariable String orderid ) {
		Optional<Kitchen> orderResponse =  orderRepository.findByOrderid(orderid);
	    return orderResponse;
		}
	
	

}