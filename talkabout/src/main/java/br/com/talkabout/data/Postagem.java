package br.com.talkabout.data;

import jakarta.persistence.*;

@Entity
@Table(name = "Postagem")
public class Postagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "corpo")
    private String corpo;

    @Column(name = "curtida", nullable = false)
    private int curtida;

    @ManyToOne
    @JoinColumn(name = "fk_Usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "fk_Topico_id", nullable = false)
    private Topico topico;

}