package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.repository.VeiculoRepository;

@Controller
public class VeiculoController {
	
	@Autowired
	private VeiculoRepository veiculoRepo;
	
	@GetMapping ("/veiculos")
	public ModelAndView listarVeiculos() {
		
		ModelAndView mv = new ModelAndView ("lista_veiculos");
		List<Veiculo> veiculos = veiculoRepo.findAll();
		mv.addObject(new Veiculo());
		mv.addObject("veiculos", veiculos);
		return mv;
		
	}
	
	@PostMapping ("/veiculos")
	public String salvar (Veiculo veiculo) {
		veiculoRepo.save(veiculo);
		return "redirect:/veiculos";
	}
	
}


