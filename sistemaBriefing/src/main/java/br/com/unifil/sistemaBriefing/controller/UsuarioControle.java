package br.com.unifil.sistemaBriefing.controller;

import br.com.unifil.sistemaBriefing.models.Cargos;
import br.com.unifil.sistemaBriefing.models.Usuario;
import br.com.unifil.sistemaBriefing.requests.UsuarioPostRequestBody;
import br.com.unifil.sistemaBriefing.requests.UsuarioPutRequestBody;
import br.com.unifil.sistemaBriefing.service.CargosServico;
import br.com.unifil.sistemaBriefing.service.UsuarioServico;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@Log4j2
@RequiredArgsConstructor
public class UsuarioControle {

    private final UsuarioServico usuarioServico;


    // Ler

    @GetMapping(path= "/listaUsuario")
    public ResponseEntity<List<Usuario>> listarUsuarios()
    {
        return ResponseEntity.ok(usuarioServico.listarTodosUsuarios());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Usuario> buscarPorIdUsuario(@PathVariable long id)
    {
        return ResponseEntity.ok(usuarioServico.buscarPorIdUsuario(id));
    }

    @PostMapping(path = "/cadastrarUsuario")
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody UsuarioPostRequestBody usuarioPostRequestBody)
    {
        return new ResponseEntity<>(usuarioServico.cadastrarUsuario(usuarioPostRequestBody), HttpStatus.CREATED);
    }

    @DeleteMapping(path ="/{id}")
    public ResponseEntity<Void> deletarUsuario(@PathVariable long id)
    {
        usuarioServico.deletarUsuario(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping(path = "/atualizarUsuario")
    public ResponseEntity<Void> atualizarUsuario(@RequestBody UsuarioPutRequestBody usuarioPutRequestBody)
    {
        usuarioServico.atualizarUsuario(usuarioPutRequestBody);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
