package com.tcs.rest.resources;
 
import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
 
import com.tcs.rest.resource.Investor3;
import com.tcs.rest.services.Investor3Service;
 
@RestController
@RequestMapping("/product/api.1.0")
@CrossOrigin("http://localhost:4200")
public class Investor3Resource {
	@Autowired
	Investor3Service service;
	@GetMapping
	public String check() {
		return "Successfull";
	}
	@GetMapping("/allInvestor")
	public List<Investor3> showAllProducts(){
		return service.getProducts();
	}
	@GetMapping("/investorid/{id}")
	public Investor3 fetchproduct(@PathVariable int id) {
		return service.getProductById(id);
	}
	@PostMapping(path="/addinvestor",consumes="application/json",produces="application/json")
	public Investor3 createProduct(@RequestBody Investor3 investor) {
		return service.save(investor);
	}
	@PutMapping(path="/updateinvestor",consumes="application/json",produces="application/json")
	public Investor3 updateProduct(@RequestBody Investor3 investor) {
		return service.update(investor);
	}
	@DeleteMapping("/removeinvestor/{id}")
	public boolean deleteProduct(@PathVariable int id) {
		return service.delete(id);
	}

 
}
