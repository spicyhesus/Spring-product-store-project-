package tn.esprit.spring.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.repository.ClientRepository;
import tn.esprit.spring.serviceInterface.IClientService;


@Service
@Slf4j
public class ClientServiceImpl implements IClientService  {
	@Autowired
	ClientRepository clientRepository;
	
	public List<Client> retrieveAllClients() {
		return (List<Client>) clientRepository.findAll();
	}
	
	public Client addClient(Client c) {
		
		return clientRepository.save(c);
	}
	
	public void deleteClient(Long id) {
		clientRepository.deleteById(id);
		
	}

	public Client updateClient(Client c) {
		return clientRepository.save(c);
	}
	
	public Client retrieveClient(Long id) {
		return clientRepository.findById(id).get();
	}

	@Override
	public List<Client> findBybirth() {
		// TODO Auto-generated method stub
		return clientRepository.retrieveClientsByBirthDate();
	}
	
	
}
