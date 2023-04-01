package br.com.jsn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/adapter_api")
public class AdapterController {
	
	
	
	
	@GetMapping("/teste")
	public String getTest() {
		return "TESTE ADAPTER API";
	}
	

}
