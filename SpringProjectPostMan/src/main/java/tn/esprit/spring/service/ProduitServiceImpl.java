package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.repository.DetailProduitRepository;
import tn.esprit.spring.repository.ProduitRepository;
import tn.esprit.spring.repository.RayonRepository;
import tn.esprit.spring.repository.StockRepository;
import tn.esprit.spring.serviceInterface.IProduitService;

@Service
public class ProduitServiceImpl implements IProduitService{
	
	@Autowired
	ProduitRepository produitRepository;
	@Autowired
	RayonRepository rayonRepository;
	@Autowired
	StockRepository stockRepository;
	@Autowired
	DetailProduitRepository detailProduitRepository;
	@Autowired
	DetailProduitServiceImpl  detailProduitService;
	public Produit addProduit(Produit p , Long idRayon, Long idStock){
		p = new Produit();
		Rayon r = rayonRepository.findById(idRayon).orElse(null);
		Stock s =stockRepository.findById(idStock).orElse(null);
		
	p.setRayon(r);
	p.setStock(s);
		
		DetailProduit dp= new DetailProduit(); 
		detailProduitRepository.save(dp);
		p.setDetailproduit(dp);
		return produitRepository.save(p);
	}
	public List<Produit> retrieveAllProduits() {
		return (List<Produit>) produitRepository.findAll();
	}
	
	
	
	public void deleteProduit(Long id) {
		produitRepository.deleteById(id);
	}
	
	public Produit updatePrduit(Produit p){
		return produitRepository.save(p);
	}
	
	public Produit retrieveProduit(Long id){
		return produitRepository.findById(id).get();
	}

}
