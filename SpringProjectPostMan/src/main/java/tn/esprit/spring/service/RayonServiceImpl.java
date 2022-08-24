package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.repository.RayonRepository;
import tn.esprit.spring.serviceInterface.IRayonService;

@Service
public class RayonServiceImpl implements IRayonService{
	
	@Autowired
	RayonRepository rayonRepository;
	
	public List<Rayon> retrieveAllRayon() {
		return (List<Rayon>) rayonRepository.findAll();
	}
	
	public Rayon addRayon(Rayon r){
		return rayonRepository.save(r);
	}
	
	public void deleteRayon(Long id) {
		rayonRepository.deleteById(id);
	}
	
	public Rayon updateRayon(Rayon r){
		return rayonRepository.save(r);
	}
	
	public Rayon retrieveRayon(Long id){
		return rayonRepository.findById(id).get();
	}
}
