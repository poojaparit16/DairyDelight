package com.coders.DairyDelight.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coders.DairyDelight.entity.Buyratechat;
import com.coders.DairyDelight.service.BuyRateChatService;

@RestController
public class BuyRateChatController {
	
	@Autowired
	BuyRateChatService service;
	
	@PostMapping("/buyRateChat")
	public Buyratechat createBuyRateChat(@RequestBody Buyratechat buyRateChat) {
		return service.createBuyRateChat(buyRateChat);
	}
	
	@GetMapping("/buyRateChat/{id}")
	public Buyratechat getBuyRateChatById(@PathVariable Long id) {
		return service.getBuyRateChatById(id);
	}
	
	@GetMapping("/buyRateChatSearch")
	public ResponseEntity<List<Buyratechat>> getBuyRateChatSearchByDate(@RequestParam Date date){
		return service.getBuyRateChatSearchByDate(date);
	}
}
