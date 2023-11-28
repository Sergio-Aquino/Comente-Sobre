package br.com.talkabout.service;

import br.com.talkabout.data.Postagem;
import br.com.talkabout.repository.PostagemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SalvarPostagemService {
private PostagemRepository postagemRepository;

    public String salvarPostagem(Postagem postagem) {
        postagemRepository.save(postagem);
        return "redirect:/";
    }
}
