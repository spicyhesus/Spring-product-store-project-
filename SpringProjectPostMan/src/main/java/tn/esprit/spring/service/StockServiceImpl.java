package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.repository.StockRepository;
import tn.esprit.spring.serviceInterface.IStockService;


@Service
public class StockServiceImpl implements IStockService {
	
	@Autowired
	StockRepository stockRepository;
	
	public List<Stock> retrieveAllStock(){
		return (List<Stock>) stockRepository.findAll();
	}
	
	public Stock addStock(Stock s){
		return stockRepository.save(s);
	}
	
	public void deleteStock(Long id){
		stockRepository.deleteById(id);
	}
	
	public Stock updateStock(Stock s){
		return stockRepository.save(s);
	}
	
	public Stock retieveStock(Long id){
		return stockRepository.findById(id).get();
	}

}
