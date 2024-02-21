package com.greta.LaBoutique.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.greta.LaBoutique.Model.Produit;

public interface ProduittRepository extends JpaRepository<Produit, Integer> {

}
