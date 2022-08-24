package tn.esprit.spring.serviceInterface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.repository.ProduitRepository;
import tn.esprit.spring.repository.RayonRepository;

public interface IRayonService {

	public List<Rayon> retrieveAllRayon();
	public Rayon addRayon(Rayon r);
	
	public void deleteRayon(Long id);
	
	public Rayon updateRayon(Rayon r);
	
	public Rayon retrieveRayon(Long id);
}

