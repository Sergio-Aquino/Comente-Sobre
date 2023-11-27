package br.com.talkabout.api;

import br.com.talkabout.data.Postagem;
import br.com.talkabout.repository.PostagemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@AllArgsConstructor
public class SalvarPostagemEndpoint {
    PostagemRepository postagemRepository;

    @PostMapping("/salvar-postagem")
    public String salvarPostagem(@ModelAttribute Postagem postagem) {
        postagemRepository.save(postagem);
        return "redirect:/";
    }
}
