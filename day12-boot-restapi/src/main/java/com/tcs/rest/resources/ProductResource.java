package com.tcs.rest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.rest.resource.Product;
import com.tcs.rest.services.ProductService;

@RestController
@RequestMapping("/product/api.1.0")
public class ProductResource {
	
	@Autowired
	ProductService service;
	
	@GetMapping
	public String check()
	{
		return "/product/api.1.0";
	}	
	@GetMapping
	@RequestMapping("/allproducts")
	public List<Product> showAllProducts(){
		return service.getProducts();
	}
	@GetMapping
	@RequestMapping("/productid/{id}")
	public Product fetchtproduct(@PathVariable int id) {
		return service.getProductById(id);
	}
	@PostMapping
	@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
	produces = MediaType.APPLICATION_JSON_VALUE,
	value = "/addproduct")
	public Product createProduct(@RequestBody Product product) {
	  return service.save(product);
	}
	
	@PutMapping(consumes =MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE,
			value = "/modifyproduct")
	public Product updateProduct(@RequestBody Product product) {
		return service.update(product);
	}
	@DeleteMapping("/deleteproduct/{id}")
	public boolean deleteproduct(@PathVariable int id) {
		return service.delete(id);
	}
	
	
}
