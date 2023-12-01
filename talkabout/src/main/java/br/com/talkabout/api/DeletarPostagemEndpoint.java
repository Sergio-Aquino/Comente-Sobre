package br.com.talkabout.api;

import br.com.talkabout.service.DeletarPostagemService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class DeletarPostagemEndpoint {
    private DeletarPostagemService deletarPostagemService;

    @GetMapping("deletar-postagem")
    private String deletarPostagem(@RequestParam int idPostagem) {
       return deletarPostagemService.deletarPostagem(idPostagem);
    }
}
