package br.com.talkabout.data;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Topico")
@Data
@NoArgsConstructor
@Getter
@Setter
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
}
