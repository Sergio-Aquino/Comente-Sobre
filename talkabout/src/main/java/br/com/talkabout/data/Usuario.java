package br.com.talkabout.data;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Usuario")
@Data
@NoArgsConstructor
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "usuario", nullable = false)
    private String nome;

    @Column(name = "senha", nullable = false)
    private String senha;

}
