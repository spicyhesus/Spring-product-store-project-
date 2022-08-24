package tn.esprit.spring.service;

import org.springframework.stereotype.Service;

import tn.esprit.spring.repository.FournisseurRepository;
import tn.esprit.spring.serviceInterface.IFournisseurService;


@Service
public class FournisseurServiceImpl implements IFournisseurService {
	
	FournisseurRepository fournisseurRepository;
}
