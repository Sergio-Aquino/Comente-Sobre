package br.com.talkabout.api;

import br.com.talkabout.service.CriarUsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@AllArgsConstructor
public class CriarUsuarioEndpoint {
    CriarUsuarioService criarUsuarioService;

    @GetMapping("/criar-usuario")
    public ModelAndView criarUsuario() {
        return criarUsuarioService.criarUsuario();
    }
}
