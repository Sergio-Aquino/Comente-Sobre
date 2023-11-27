package br.com.talkabout.repository;

import br.com.talkabout.data.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Integer> {
}
