package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Facture;
import tn.esprit.spring.repository.FactureRepository;
import tn.esprit.spring.serviceInterface.IFactureService;

@Service
public class FactureServiceImpl implements IFactureService{
	
	@Autowired
	FactureRepository factureRepository;
	
	
	
	public List<Facture> retrieveAllFactures(){
		return (List<Facture>)factureRepository.findAll();
	}
	
	public Facture addFacture(Facture f){
		return factureRepository.save(f);
	}
	
	public Facture updateFacture(Facture f){
		return factureRepository.save(f);
	}
	
	public void cancelFacture(Long id) {
		Facture f = factureRepository.findById(id).get();
		//f.setActive(false);
		factureRepository.delete(f);
		
	}
	
	public Facture retrieveFacture(Long id){
		return factureRepository.findById(id).get();
	}
	
	
	
}
