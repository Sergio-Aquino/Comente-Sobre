package br.com.talkabout.api;

import br.com.talkabout.data.Usuario;
import br.com.talkabout.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
@AllArgsConstructor
public class SalvarUsuarioEndpoint {
    private final UsuarioRepository usuarioRepository;

    @PostMapping("/salvar-usuario")
    public String registerUser(@ModelAttribute Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/";
    }
}
