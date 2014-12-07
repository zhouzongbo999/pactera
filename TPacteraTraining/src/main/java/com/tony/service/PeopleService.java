package com.tony.service;

import org.springframework.stereotype.Service;

@Service
public class PeopleService implements IPeopleService{
	public void speak(){
		System.out.println("PeopleSerivce speak");
	}
}
