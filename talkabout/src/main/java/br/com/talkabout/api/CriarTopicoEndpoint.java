package br.com.talkabout.api;

import br.com.talkabout.service.CriarTopicoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class CriarTopicoEndpoint {
    private CriarTopicoService criarTopicoService;

    @GetMapping("/criar-topico")
    public ModelAndView criarTopico() {
        return criarTopicoService.criarTopico();
    }
}
