package br.com.talkabout.service;

import br.com.talkabout.data.Comentario;
import br.com.talkabout.repository.ComentarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SalvarComentarioService {
    private ComentarioRepository comentarioRepository;
    public String salvarComentario(Comentario comentario) {
        comentarioRepository.save(comentario);
        return "redirect:/";
    }
}
