package com.greenswap.greenswap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Picture;


public interface PictureRepository extends JpaRepository<Picture, Long> {
	//Vide --> c'est normal
}
