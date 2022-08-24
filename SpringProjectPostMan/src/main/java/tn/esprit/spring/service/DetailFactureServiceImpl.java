package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.DetailFacture;
import tn.esprit.spring.repository.DetailFactureRepository;
import tn.esprit.spring.serviceInterface.IDetailFactureService;

@Service
public class DetailFactureServiceImpl implements IDetailFactureService {
	
	@Autowired
	DetailFactureRepository detailFactureRepository;
	
	
	
	public List<DetailFacture> retrieveAllDetailsF (){
		return (List<DetailFacture>) detailFactureRepository.findAll();
	}
	
	public DetailFacture addDetailFacture(DetailFacture df) {
		return detailFactureRepository.save(df);
	
	}
	
	public void deleteDetail(Long id){
		detailFactureRepository.deleteById(id);
	}
	
	public DetailFacture updateDetail(DetailFacture df){
		return detailFactureRepository.save(df);
	}
	
	public DetailFacture retrieveFacture(Long id){
		return detailFactureRepository.findById(id).get();
	}

}
