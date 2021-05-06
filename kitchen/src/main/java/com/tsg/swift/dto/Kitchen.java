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
public class Kitchen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "orderid")
	private String orderid;

	@Column(name = "server")
	private String server;


	@Column(name = "datetime")
	 @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	    private Date datetime;
	
	@Column(name = "tablenumber")
	private String tablenumber;
	
	
	@Column(name = "status")
	private String status;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getOrderid() {
		return orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	
	
	public String getServer() {
		return server;
	}

	public void setName(String server) {
		this.server = server;
	}
	


	public String getTablenumber() {
		return tablenumber;
	}

	public void setTablenumber(String tablenumber) {
		this.tablenumber = tablenumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	 @OneToMany(cascade = CascadeType.PERSIST)
	    @JoinColumn(name ="kitchen_id")  
	       private List<KitchenItem> items = new ArrayList<>();
	       public List<KitchenItem> getItems() {
	          return items;
	        }

	      public void setItems(List<KitchenItem> items) {
	           this.items = items;
	        }	
	      
	   

}