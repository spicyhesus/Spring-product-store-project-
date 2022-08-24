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

import tn.esprit.spring.entity.Rayon;
import tn.esprit.spring.entity.Stock;
import tn.esprit.spring.service.RayonServiceImpl;
import tn.esprit.spring.service.StockServiceImpl;

@RestController
@RequestMapping("/Rayon")
public class RayonController {

	
	@Autowired
	RayonServiceImpl RayonService;
	
	@PostMapping("/add-rayon")
	@ResponseBody
	Rayon addRayon(@RequestBody Rayon r) {
		return RayonService.addRayon(r);	
	}
	
	
	@GetMapping("/retrieve-allRayon")
	List<Rayon> retrieveAllRayon() {
		return RayonService.retrieveAllRayon();
	}
	
	@GetMapping("/retrieve-rayon/{rayon-id}")
	@ResponseBody
	public Rayon retrieveRayon(@PathVariable("rayon-id") Long rayonId) {
	return RayonService.retrieveRayon(rayonId);
	}
	
	@PutMapping("/modify-rayon")
	@ResponseBody
	public Rayon modifyRayon(@RequestBody Rayon rayon) {
	return RayonService.updateRayon(rayon);
	}
	@DeleteMapping("/remove-rayon/{rayon-id}")
	@ResponseBody
	public void removeRayon(@PathVariable("rayon-id") Long rayonId) {
		RayonService.deleteRayon(rayonId);
	}
}
