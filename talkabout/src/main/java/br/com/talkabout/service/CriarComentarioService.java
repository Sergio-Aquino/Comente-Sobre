package br.com.talkabout.service;

import br.com.talkabout.data.Comentario;
import br.com.talkabout.data.Postagem;
import br.com.talkabout.repository.PostagemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CriarComentarioService {
    PostagemRepository postagemRepository;
    public ModelAndView criarComentario(int idPostagem) {
        Optional<Postagem> postagem = postagemRepository.findById(idPostagem);
        if (postagem.isPresent()) {
            Comentario comentario = new Comentario();
            comentario.setPostagem(postagem.get());
            comentario.setUsuario(postagem.get().getUsuario());

            ModelAndView mav = new ModelAndView("add-comment");
            mav.addObject("comentario", comentario);
            return mav;
        }

        throw new RuntimeException("Postagem não encontrada");
    }
}
