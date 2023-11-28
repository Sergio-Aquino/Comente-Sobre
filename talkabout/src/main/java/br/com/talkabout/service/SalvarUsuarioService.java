package br.com.talkabout.service;

import br.com.talkabout.data.Usuario;
import br.com.talkabout.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SalvarUsuarioService {
    private final UsuarioRepository usuarioRepository;
    public String salvarUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
        return "redirect:/";
    }
}
