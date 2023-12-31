package br.com.talkabout.api;

import br.com.talkabout.service.CriarComentarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class CriarComentarioEndpoint {
    CriarComentarioService criarComentarioService;

    @GetMapping("/criar-comentario")
    public ModelAndView criarComentario(@RequestParam int idPostagem) {
         return criarComentarioService.criarComentario(idPostagem);
    }
}
