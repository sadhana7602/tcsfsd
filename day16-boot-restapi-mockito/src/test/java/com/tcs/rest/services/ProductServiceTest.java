package com.tcs.rest.services;
 
import java.util.Optional;
 
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.RETURNS_DEEP_STUBS;
 
 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
 
import com.tcs.rest.repository.ProductRepository;
import com.tcs.rest.resource.Product;
 
@ExtendWith(MockitoExtension.class)  
public class ProductServiceTest {
	@InjectMocks
	private ProductService service;
 
	  
 
	@Mock 
	private ProductRepository repository;
 
	 
	@BeforeEach
	void setUp() {
		Optional<Product> optional = Optional.of(new Product(9,"Smart Washing machine",125000.0));
		System.out.println(optional.get());
		Mockito.when(repository.findById(9)).thenReturn(optional);
		}
	@Test
	public void testGetproductById() {
		double expected_price = 125000.0;
		Product prod = service.getProductById(9);
		assertEquals(expected_price,prod.getPrice());
	}
 
}