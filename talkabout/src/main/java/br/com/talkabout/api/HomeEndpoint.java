package br.com.talkabout.api;

import br.com.talkabout.repository.PostagemRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@AllArgsConstructor
public class HomeEndpoint {
    private PostagemRepository postagemRepository;
    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mav = new ModelAndView("show-posts");
        mav.addObject("postagens", postagemRepository.findAll());
        return mav;

    }
}
