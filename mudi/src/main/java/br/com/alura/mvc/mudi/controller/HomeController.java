package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.data.annotation.Persistent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Controller
public class HomeController {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Query query = entityManager.createQuery("select p from Pedido p", Pedido.class);
		List<Pedido> pedidos = query.getResultList();
		
		model.addAttribute("pedidos", pedidos);		
		return "home";
	}

}
