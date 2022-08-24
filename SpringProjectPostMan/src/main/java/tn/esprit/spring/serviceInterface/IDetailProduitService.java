package tn.esprit.spring.serviceInterface;

import java.util.List;

import tn.esprit.spring.entity.DetailProduit;

public interface IDetailProduitService {
	
	List<DetailProduit> retrieveAllDetailsP();
	DetailProduit addDetailP(DetailProduit dp);
	void deleteDetailP(Long id);
	DetailProduit updateDetailP(DetailProduit dp);
	DetailProduit retieveDetailP(Long id);

}
