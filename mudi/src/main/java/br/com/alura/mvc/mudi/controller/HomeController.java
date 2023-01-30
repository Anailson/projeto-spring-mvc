package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Xiaomi Redmi Note 11");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51e3KdrHuCL._AC_SX569_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/Xiaomi-Redmi-Note-11-Graphite/dp/B09QSB4N2C/ref=zg_bs_"
				+ "16243890011_sccl_1/138-8759780-6595811?psc=1");
		pedido.setDescricao("Uma descrição do celular");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);		
		
		return "home";
	}

}
