package br.com.talkabout.api;

import br.com.talkabout.data.Topico;
import br.com.talkabout.repository.TopicoRepository;
import br.com.talkabout.service.SalvarTopicoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class SalvarTopicoEndpoint {
    private SalvarTopicoService salvarTopicoService;

    @PostMapping ("/salvar-topico")
    public String salvarTopico(@ModelAttribute Topico topico) {
        return salvarTopicoService.salvarTopico(topico);
    }
}
