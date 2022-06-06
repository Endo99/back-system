package br.com.unifil.sistemaBriefing.requests;

import lombok.Data;

@Data
public class UsuarioPostRequestBody {

    private long idUsuario;

    private String nome;

    private String sobrenome;

    private String email;

    private String cargo;

    private String telefone;

    private String senha;

    private String senhaNovamente;

}
