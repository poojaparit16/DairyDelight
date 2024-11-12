package com.coders.DairyDelight.service;


import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.coders.DairyDelight.entity.Buyratechat;
import com.coders.DairyDelight.entity.Customer;
import com.coders.DairyDelight.repository.BuyRateChatRepository;

@Service
public class BuyRateChatService {
	
	@Autowired
	BuyRateChatRepository repository;
	
	public Buyratechat createBuyRateChat(Buyratechat buyRateChat) {
		return repository.save(buyRateChat);
	}
		
	public Buyratechat getBuyRateChatById(Long id) {
		return repository.findById(id).get();
	}
	
	public ResponseEntity<List<Buyratechat>> getBuyRateChatSearchByDate(Date date){
		
		List<Buyratechat> buyratechat =repository.getBuyRateChatSearchByDate(date);
		return new ResponseEntity<>(buyratechat, HttpStatus.OK);
		
	}	
	
}
