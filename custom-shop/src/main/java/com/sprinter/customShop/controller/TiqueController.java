package com.sprinter.customShop.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprinter.customShop.dto.TiqueDTO;
import com.sprinter.customShop.entity.Tique;

@RestController
@RequestMapping("/tique")
public class TiqueController extends AbstractController<TiqueDTO, Tique, Long> {
	
	protected TiqueController() {
		super(Tique.class, TiqueDTO.class);
	}

}
