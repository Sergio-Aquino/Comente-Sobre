package br.com.talkabout.service;

import br.com.talkabout.data.Postagem;
import br.com.talkabout.data.Topico;
import br.com.talkabout.data.Usuario;
import br.com.talkabout.repository.TopicoRepository;
import br.com.talkabout.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Service
@AllArgsConstructor
public class CriarPostagemService {
    private UsuarioRepository usuarioRepository;
    private TopicoRepository topicoRepository;
    public ModelAndView criarPostagem() {
        ModelAndView mav = new ModelAndView("add-post");
        Postagem postagem = new Postagem();
        mav.addObject("postagem", postagem);

        List<Topico> topicos = topicoRepository.findAll();
        mav.addObject("topicos", topicos);

        return mav;
    }
}
