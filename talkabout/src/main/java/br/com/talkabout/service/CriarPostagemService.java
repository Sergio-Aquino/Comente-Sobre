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

@Service
@AllArgsConstructor
public class CriarPostagemService {
    UsuarioRepository usuarioRepository;
    TopicoRepository topicoRepository;
    public ModelAndView criarPostagem(@RequestParam Usuario usuario, @RequestParam Topico topico) {
        ModelAndView mav = new ModelAndView("add-post");
        Postagem novaPostagem = new Postagem();

        if (usuarioRepository.findById(usuario.getId()).isEmpty()) {
            throw new RuntimeException("Usuario não encontrado");
        }

        if (topicoRepository.findById(topico.getId()).isEmpty()) {
            throw new RuntimeException("Topico não encontrado");
        }

        novaPostagem.setUsuario(usuario);
        novaPostagem.setTopico(topico);
        mav.addObject("postagem", novaPostagem);
        return mav;
    }
}
