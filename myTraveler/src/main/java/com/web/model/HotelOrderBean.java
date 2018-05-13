package com.web.model;

import java.io.Serializable;
import java.sql.Date;


public class HotelOrderBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer order_id;
	private String hotel_name;
	private String cancelTag;
	private String invoiceTitle;
	private String account;
	private Date order_date;
	private Date booking_date;
	private Integer room_id;
	private Double totalAmount;

	


	

}