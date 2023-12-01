package br.com.talkabout.service;

import br.com.talkabout.data.Topico;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class CriarTopicoService {
    public ModelAndView criarTopico() {
        ModelAndView mav = new ModelAndView("add-topic");
        Topico topico = new Topico();
        mav.addObject("topico", topico);
        return mav;
    }
}
