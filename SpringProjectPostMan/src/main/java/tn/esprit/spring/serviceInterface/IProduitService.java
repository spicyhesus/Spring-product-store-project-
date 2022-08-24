package tn.esprit.spring.serviceInterface;

import java.util.List;

import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.entity.Produit;

public interface IProduitService {

	
	List<Produit> retrieveAllProduits();
	Produit addProduit(Produit p , Long idRayon, Long idStock);
	void deleteProduit(Long id);
	Produit updatePrduit(Produit p);
	Produit retrieveProduit(Long id);
}
