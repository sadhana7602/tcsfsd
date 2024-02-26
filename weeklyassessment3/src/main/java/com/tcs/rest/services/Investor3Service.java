package com.tcs.rest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.rest.repository.Investor3Repository;

import com.tcs.rest.resource.Investor3;


@Service
public class Investor3Service {
	
	@Autowired
	Investor3Repository repo;
	
	public List<Investor3> getProducts(){
		
		List<Investor3> list=repo.findAll();
		return list;
		
	}
	public Investor3 getProductById(int id) {
		
		Optional<Investor3> prod = repo.findById(id);
		return prod.get();
	}
    public Investor3 save(Investor3 p) {
    	return repo.save(p);
    	
    }
    public Investor3 update(Investor3 p) {
    	
    	Optional<Investor3> optional= repo.findById(p.getId());
    	Investor3 tempProduct= optional.get();
    	tempProduct.setName(p.getName());
    	tempProduct.setAddress(p.getAddress());
    	tempProduct.setInstrument(p.getInstrument());
    	tempProduct.setAmount(p.getAmount());
    	
    	return repo.save(tempProduct);
    }
    
    public boolean delete(int id) {
    	repo.deleteById(id);
    	return true;
    }
}
