package com.example.demo.dao;





import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Produit;



public interface ProduitRepositery extends MongoRepository<Produit, Long> {
	/*@Query("select p from Produit p where p.designation like :x")*/
public Page<Produit>produitParMC(@Param("x")String mc,Pageable p);
public List<Produit> findByDesignation(String des);
public Page<Produit> findByDesignation(String des, Pageable p);

}
