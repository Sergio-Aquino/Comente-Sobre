package br.com.talkabout.data;

import jakarta.persistence.*;

@Entity
@Table(name = "Topico")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
}
