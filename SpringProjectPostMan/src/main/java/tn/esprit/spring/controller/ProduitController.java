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
import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.service.ClientServiceImpl;
import tn.esprit.spring.service.ProduitServiceImpl;

@RestController
@RequestMapping("/Produit")
public class ProduitController {
	@Autowired
	ProduitServiceImpl ProduitService;
	
	@PostMapping("/add-produit")
	@ResponseBody
	Produit addProduit(@RequestBody Produit p, Long idRayon, Long idStock) {
		return ProduitService.addProduit(p, idRayon, idStock);	
	}
	
	
	@GetMapping("/retrieve-allProducts")
	List<Produit> retrieveAllProducts() {
		return ProduitService.retrieveAllProduits();
	}
	
	@GetMapping("/retrieve-produit/{produit-id}")
	@ResponseBody
	public Produit retrieveProduit(@PathVariable("produit-id") Long productId) {
	return ProduitService.retrieveProduit(productId);
	}
	
	@PutMapping("/modify-produit")
	@ResponseBody
	public Produit modifyProduit(@RequestBody Produit produit) {
	return ProduitService.updatePrduit(produit);
	}
	@DeleteMapping("/remove-produit/{produit-id}")
	@ResponseBody
	public void removeClient(@PathVariable("produit-id") Long produitId) {
		ProduitService.deleteProduit(produitId);
	}
}
