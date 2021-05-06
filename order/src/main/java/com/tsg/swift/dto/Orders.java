package com.tsg.swift.dto;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "server")
	private String server;


	
	@Column(name = "datetime")
	 @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	    private Date datetime;
	
	@Column(name = "tableno")
	private String tableno;
	
	
	@Column(name = "seats")
	private String seats;
	
	
	@Column(name = "checknumber")
	private String checknumber;
	


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getServer() {
		return server;
	}

	public void setName(String server) {
		this.server = server;
	}
	


	public String getTableno() {
		return tableno;
	}

	public void setTableno(String tableno) {
		this.tableno = tableno;
	}

	public String getSeats() {
		return seats;
	}

	public void setSeats(String seats) {
		this.seats = seats;
	}

	public String getCheck() {
		return checknumber;
	}

	public void setCheck(String checknumber) {
		this.checknumber = checknumber;
	}


	 @OneToMany(cascade = CascadeType.PERSIST)
	    @JoinColumn(name ="order_id")  
	       private List<OrderItem> items = new ArrayList<>();
	       public List<OrderItem> getItems() {
	          return items;
	        }

	      public void setItems(List<OrderItem> items) {
	           this.items = items;
	        }	
	      
	      @OneToMany(cascade = CascadeType.PERSIST)
		    @JoinColumn(name ="order_id")  
		       private List<Guests> guests = new ArrayList<>();
		       public List<Guests> getGuests() {
		          return guests;
		        }

		      public void setTable(List<Guests> guests) {
		           this.guests = guests;
		        }

}