package br.com.talkabout.api;


import br.com.talkabout.service.CriarPostagemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class CriarPostagemEndpoint {
    private final CriarPostagemService criarPostagemService;

    @GetMapping("/criar-postagem")
    public ModelAndView criarPostagem() {
       return criarPostagemService.criarPostagem();
    }
}
