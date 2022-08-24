package tn.esprit.spring.serviceInterface;

import java.util.List;

import tn.esprit.spring.entity.Stock;

public interface IStockService {

	List<Stock> retrieveAllStock(); 
	Stock addStock(Stock s);
	void deleteStock(Long id);
	Stock updateStock(Stock s);
	Stock retieveStock(Long id);
}
