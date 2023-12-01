package br.com.talkabout.service;

import br.com.talkabout.repository.PostagemRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DeletarPostagemService {
    private PostagemRepository postagemRepository;
    public String deletarPostagem(int idPostagem) {
        postagemRepository.deleteById(idPostagem);
        return "redirect:/";
    }
}
