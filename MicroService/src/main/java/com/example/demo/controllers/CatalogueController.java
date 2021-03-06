package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ProduitRepositery;

import com.example.demo.entities.Produit;

import java.util.List;

@RestController
public class CatalogueController {

		@Autowired
		private ProduitRepositery produitRepository;
		
		@RequestMapping("/save")
		public Produit saveProduit(Produit p) {
			produitRepository.save(p);
			return p;
		}
		
		@RequestMapping("/all")
		public List<Produit> getProduits(){
			return produitRepository.findAll();
		}
		@RequestMapping("/produits")
		public Page<Produit> getProduits(int page){
			return produitRepository.findAll(new PageRequest(page, 5));
					}
	/*	@RequestMapping("/produitsParMC")
		public Page<Produit> getProduits(String mc,int page){
			return produitRepository.produitParMC("%"+mc+"%", new PageRequest(page,5));
					}					
	/*	@RequestMapping("/get")
		public Produit getProduit(Long ref) {
			return produitRepository.getOne(ref);
		}*/
		@RequestMapping("/delete")
		public boolean delete(Long ref) {
			produitRepository.deleteById(ref);
			return true;
		}
		
		@RequestMapping("/update")
		public Produit update(Produit p) {
			produitRepository.save(p);
			return p;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
