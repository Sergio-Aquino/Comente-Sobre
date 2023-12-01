package br.com.talkabout.repository;

import br.com.talkabout.data.Comentario;
import br.com.talkabout.data.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {
    List<Comentario> findByPostagemId(int idPostagem);
}
