package br.com.talkabout.repository;

import br.com.talkabout.data.Postagem;
import br.com.talkabout.data.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostagemRepository extends JpaRepository<Postagem, Integer> {
    Usuario getFkUsuario();

}
