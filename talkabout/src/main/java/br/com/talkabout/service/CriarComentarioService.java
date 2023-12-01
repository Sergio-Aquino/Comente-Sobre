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
        ModelAndView mav = new ModelAndView("add-comment");
        Comentario comentario = new Comentario();

        Postagem postagem = postagemRepository.findById(idPostagem).orElseThrow(() -> new RuntimeException("Postagem não encontrada"));
        comentario.setPostagem(postagem);

        mav.addObject("comentario", comentario);
        return mav;
    }
}
