package br.com.talkabout.service;

import br.com.talkabout.data.Postagem;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class CriarPostagemService {
    public ModelAndView criarPostagem() {
        ModelAndView mav = new ModelAndView("add-post");
        Postagem novaPostagem = new Postagem();
        mav.addObject("postagem", novaPostagem);
        return mav;
    }
}
