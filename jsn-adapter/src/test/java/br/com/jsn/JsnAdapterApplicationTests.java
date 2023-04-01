package br.com.jsn;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.jsn.adapter.Adaptee;
import br.com.jsn.adapter.Adapter;
import br.com.jsn.adapter.Target;

@SpringBootTest
class JsnAdapterApplicationTests {

	@Test
	void contextLoads() {

		Target target = new Target();
		Adaptee adaptee = new Adaptee();
		Adapter adapter = new Adapter(adaptee);
		
		target.operation();
		
		adaptee.specificRequest();
		
		adapter.operation();
		
		
	}
	
	

}
