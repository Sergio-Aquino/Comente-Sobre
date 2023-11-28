package br.com.talkabout.api;

import br.com.talkabout.data.Postagem;
import br.com.talkabout.service.SalvarPostagemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class SalvarPostagemEndpoint {
    SalvarPostagemService salvarPostagemService;

    @PostMapping("/salvar-postagem")
    public String salvarPostagem(@ModelAttribute Postagem postagem) {
        return salvarPostagemService.salvarPostagem(postagem);
    }
}
