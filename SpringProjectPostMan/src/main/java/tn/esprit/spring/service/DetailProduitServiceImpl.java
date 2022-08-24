package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.DetailProduit;
import tn.esprit.spring.repository.DetailProduitRepository;
import tn.esprit.spring.serviceInterface.IDetailProduitService;

@Service
public class DetailProduitServiceImpl implements IDetailProduitService {
	
	@Autowired
	DetailProduitRepository detailProduitRepository;
	
	public List<DetailProduit> retrieveAllDetailsP(){
		return (List<DetailProduit>) detailProduitRepository.findAll();
	}
	
	public DetailProduit addDetailP(DetailProduit dp){
		return detailProduitRepository.save(dp);
	}
	
	public void deleteDetailP(Long id){
		detailProduitRepository.deleteById(id);
	}
	
	public DetailProduit updateDetailP(DetailProduit dp){
		return detailProduitRepository.save(dp);
	}
	
	public DetailProduit retieveDetailP(Long id){
		return detailProduitRepository.findById(id).get();
	}
}
