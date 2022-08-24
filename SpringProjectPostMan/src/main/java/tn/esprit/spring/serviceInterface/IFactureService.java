package tn.esprit.spring.serviceInterface;

import java.util.List;

import tn.esprit.spring.entity.Facture;

public interface IFactureService {
	
	List<Facture> retrieveAllFactures();
	Facture addFacture(Facture f);
	Facture updateFacture(Facture f);
	void cancelFacture(Long id);
	Facture retrieveFacture(Long id);
		

}
