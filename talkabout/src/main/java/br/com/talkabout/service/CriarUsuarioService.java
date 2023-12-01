package br.com.talkabout.service;

import br.com.talkabout.data.Usuario;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class CriarUsuarioService {
    public ModelAndView criarUsuario() {
        ModelAndView mav = new ModelAndView("create-user");
        Usuario usuario = new Usuario();
        mav.addObject("usuario", usuario);
        return mav;
    }
}
