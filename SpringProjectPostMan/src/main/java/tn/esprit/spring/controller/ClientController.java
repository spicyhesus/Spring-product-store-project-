package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Client;
import tn.esprit.spring.service.ClientServiceImpl;
@RestController
@RequestMapping("/Client")
public class ClientController {

	@Autowired
	ClientServiceImpl ClientService;
	
	@PostMapping("/add-client")
	@ResponseBody
	Client addClient(@RequestBody Client c) {
		return ClientService.addClient(c);	
	}
	
	
	@GetMapping("/retrieve-allClient")
	List<Client> retrieveAllCLient() {
		return ClientService.retrieveAllClients();
	}
	
	@GetMapping("/retrieve-client/{client-id}")
	@ResponseBody
	public Client retrieveClient(@PathVariable("client-id") Long clientId) {
	return ClientService.retrieveClient(clientId);
	}
	
	@PutMapping("/modify-client")
	@ResponseBody
	public Client modifyClient(@RequestBody Client client) {
	return ClientService.updateClient(client);
	}
	@DeleteMapping("/remove-client/{client-id}")
	@ResponseBody
	public void removeClient(@PathVariable("client-id") Long clientId) {
	ClientService.deleteClient(clientId);
	}
	
}
