package br.com.talkabout.api;


import br.com.talkabout.data.Topico;
import br.com.talkabout.data.Usuario;
import br.com.talkabout.service.CriarPostagemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class CriarPostagemEndpoint {
    private final CriarPostagemService criarPostagemService;

    @PostMapping("/criar-postagem")
    public ModelAndView criarPostagem(@RequestParam Usuario usuario, @RequestParam Topico topico) {
       return criarPostagemService.criarPostagem(usuario, topico);
    }
}
