package br.com.talkabout.service;

import br.com.talkabout.data.Topico;
import br.com.talkabout.repository.TopicoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SalvarTopicoService {
    private TopicoRepository topicoRepository;
    public String salvarTopico(Topico topico) {
        topicoRepository.save(topico);
        return "redirect:/";
    }
}
