package br.usjt.hellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.hellospringboot.model.Previsao;
import br.usjt.hellospringboot.repository.PrevisoesRepository;
import br.usjt.hellospringboot.service.PrevisaoService;

@Controller
public class PrevisaoController {
	@Autowired
	private PrevisaoService previsaoService;
	
	@GetMapping("/previsoes")
	public ModelAndView listarPrevisoes() {
		
		ModelAndView mv = new ModelAndView("lista_previsoes");
		
		mv.addObject(new Previsao());
		
		List<Previsao> previsoes = previsaoService.listarTodos();
		
		mv.addObject("previsoes", previsoes);
				
		return mv;
	}
	
	@PostMapping("/previsoes")
	public String salvar(Previsao previsao) {
		previsaoService.salvar(previsao);
		return "redirect:/previsoes";
	}

}
