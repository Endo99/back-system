package br.com.unifil.sistemaBriefing.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Usuario implements Serializable{

    private static final long serialVersionUI = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long idUsuario;

    private String nome;

    private String sobrenome;

    private String email;

    private String telefone;

    private String cargo;

    private String senha;

    private String senhaNovamente;

}
