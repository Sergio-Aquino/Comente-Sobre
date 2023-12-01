package br.com.talkabout.data;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "Comentario")
@Data
@Getter
@Setter
@NoArgsConstructor
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "corpo", nullable = false)
    private String corpo;

    @Column(name = "curtida", nullable = false)
    private int curtida;

    @ManyToOne
    @JoinColumn(name = "fk_Postagem_id", nullable = false)
    private Postagem postagem;

    @ManyToOne
    @JoinColumn(name = "fk_Usuario_id", nullable = false)
    private Usuario usuario;
}
