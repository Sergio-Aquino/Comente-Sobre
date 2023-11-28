package br.com.talkabout.api;

import br.com.talkabout.data.Usuario;
import br.com.talkabout.service.SalvarUsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class SalvarUsuarioEndpoint {
    private SalvarUsuarioService salvarUsuarioService;

    @PostMapping("/salvar-usuario")
    public String registerUser(@ModelAttribute Usuario usuario) {
        return salvarUsuarioService.salvarUsuario(usuario);
    }
}
