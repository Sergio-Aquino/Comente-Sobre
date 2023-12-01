package br.com.talkabout.service;

import br.com.talkabout.data.Comentario;
import br.com.talkabout.data.Postagem;
import br.com.talkabout.repository.ComentarioRepository;
import br.com.talkabout.repository.PostagemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SalvarComentarioService {
    private ComentarioRepository comentarioRepository;
    private PostagemRepository postagemRepository;
    public String salvarComentario(Comentario comentario, int idPostagem) {
        comentario.setPostagem(postagemRepository.findById(idPostagem).get());
        comentarioRepository.save(comentario);
        return "redirect:/";
    }
}
