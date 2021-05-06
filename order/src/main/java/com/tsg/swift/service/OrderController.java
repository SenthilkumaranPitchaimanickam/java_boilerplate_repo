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
import com.tsg.swift.dao.OrderRepository;
import com.tsg.swift.dto.OrderItem;
import com.tsg.swift.dto.Orders;
import com.tsg.swift.dto.Response;

import org.springframework.kafka.core.KafkaTemplate;





@RestController
public class OrderController {

	
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private ItemRepository itemRepository;
	@Autowired
    private KafkaTemplate<String,Orders> kafkaTemplate;
	private static final String TOPIC = "Kafka_Topic";

	
	@GetMapping("/order")
	public List getAllOrder() {
		List findAllOrder = orderRepository.findAll();
	    return findAllOrder;
	}
	
	@PostMapping("/order")
	public Response createOrder(@RequestBody Orders order) {
		List<OrderItem> items1 =order.getItems();
	    //List<Guests> table1 =order.getGuests();
		kafkaTemplate.send(TOPIC,order);
	     orderRepository.save(order);
	     Response response = new Response();
		   response.setId(order.getId());
		   response.setMessage("Success");
		   return response;
	}
	

	  @GetMapping("/order/{id}")
	  public Optional<Orders> getOrder(@PathVariable long id ) {
		Optional<Orders> orderResponse =  orderRepository.findById(id);
	    return orderResponse;
		}
	
	

}