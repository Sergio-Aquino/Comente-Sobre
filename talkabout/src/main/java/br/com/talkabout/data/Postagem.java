package br.com.talkabout.data;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Postagem")
@Data
@Getter
@Setter
@NoArgsConstructor
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
    @JoinColumn(name = "fk_Usuario_id", nullable = true)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "fk_Topico_id", nullable = false)
    private Topico topico;

    @Column(name = "email", nullable = false)
    private String email;

}