package br.com.talkabout.api;

import br.com.talkabout.data.Comentario;
import br.com.talkabout.service.SalvarComentarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
public class SalvarComentarioEndpoint {
    private SalvarComentarioService salvarComentarioService;

    @PostMapping("/salvar-comentario")
    public String salvarComentario(@ModelAttribute Comentario comentario, @RequestParam int idPostagem) {
        return salvarComentarioService.salvarComentario(comentario, idPostagem);
    }
}
