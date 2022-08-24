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

import tn.esprit.spring.entity.Produit;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.service.ProduitServiceImpl;
import tn.esprit.spring.service.StockServiceImpl;

@RestController
@RequestMapping("/Stock")
public class StockController {
	@Autowired
	StockServiceImpl StockService;
	
	@PostMapping("/add-stock")
	@ResponseBody
	Stock addStock(@RequestBody Stock s) {
		return StockService.addStock(s);	
	}
	
	
	@GetMapping("/retrieve-allStock")
	List<Stock> retrieveAllStock() {
		return StockService.retrieveAllStock();
	}
	
	@GetMapping("/retrieve-stock/{stock-id}")
	@ResponseBody
	public Stock retrieveStock(@PathVariable("stock-id") Long stockId) {
	return StockService.retieveStock(stockId);
	}
	
	@PutMapping("/modify-stock")
	@ResponseBody
	public Stock modifyProduit(@RequestBody Stock stock) {
	return StockService.updateStock(stock);
	}
	@DeleteMapping("/remove-stock/{stock-id}")
	@ResponseBody
	public void removeStock(@PathVariable("stock-id") Long stockId) {
		StockService.deleteStock(stockId);
	}

	
	
}
