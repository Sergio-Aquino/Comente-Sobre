package br.com.talkabout.service;

import br.com.talkabout.data.Postagem;
import br.com.talkabout.data.Topico;
import br.com.talkabout.data.Usuario;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Service
public class CriarPostagemService {
    public ModelAndView criarPostagem(@RequestParam Usuario usuario, @RequestParam Topico topico) {
        ModelAndView mav = new ModelAndView("add-post");
        Postagem novaPostagem = new Postagem();
        novaPostagem.setUsuario(usuario);
        novaPostagem.setTopico(topico);
        mav.addObject("postagem", novaPostagem);
        return mav;
    }
}
