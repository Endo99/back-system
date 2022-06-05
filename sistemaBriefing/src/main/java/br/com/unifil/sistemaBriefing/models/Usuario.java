package br.com.unifil.sistemaBriefing.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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

    @Override
    public String toString() {
        return "Usuário {" +
                "id=" + idUsuario +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cargo='" + cargo + '\'' +
                ", senha='" + senha + '\'' +
                ", senhaNovamente='" + senhaNovamente + '\''
                + "}";
    }
}
