package tn.esprit.spring.serviceInterface;

import java.util.List;

import tn.esprit.spring.entity.DetailFacture;

public interface IDetailFactureService {
	
	List<DetailFacture> retrieveAllDetailsF();
	DetailFacture addDetailFacture(DetailFacture df);
	void deleteDetail(Long id);
	DetailFacture updateDetail(DetailFacture df);
	DetailFacture retrieveFacture(Long id);
	

}
