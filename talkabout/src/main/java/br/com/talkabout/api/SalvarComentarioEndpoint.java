package br.com.talkabout.api;

import br.com.talkabout.data.Comentario;
import br.com.talkabout.service.SalvarComentarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class SalvarComentarioEndpoint {
    private SalvarComentarioService salvarComentarioService;

    @PostMapping("/salvar-comentario")
    public String salvarComentario(Comentario comentario) {
        return salvarComentarioService.salvarComentario(comentario);
    }
}
