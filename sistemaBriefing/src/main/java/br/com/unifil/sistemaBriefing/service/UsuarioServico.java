package br.com.unifil.sistemaBriefing.service;

import br.com.unifil.sistemaBriefing.mapper.UsuarioMapper;
import br.com.unifil.sistemaBriefing.models.Usuario;
import br.com.unifil.sistemaBriefing.repository.UsuarioRepositorio;
import br.com.unifil.sistemaBriefing.requests.UsuarioPostRequestBody;
import br.com.unifil.sistemaBriefing.requests.UsuarioPutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioServico {

    private final UsuarioRepositorio usuarioRepositorio;

    public List<Usuario> listarTodosUsuarios() {
        return usuarioRepositorio.findAll();
    }

    public Usuario buscarPorIdUsuario(long idUsuario) {
        return usuarioRepositorio.findById(idUsuario)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Usuário não encontrado"));
    }

    public Usuario cadastrarUsuario(UsuarioPostRequestBody usuarioPostRequestBody)
    {

        return usuarioRepositorio.save(UsuarioMapper.INSTANCE.toUsuario(usuarioPostRequestBody));
    }
    public void atualizarUsuario(UsuarioPutRequestBody usuarioPutRequestBody) {
        Usuario salvarUsuario = buscarPorIdUsuario(usuarioPutRequestBody.getIdUsuario());
        Usuario usuario = UsuarioMapper.INSTANCE.toUsuario(usuarioPutRequestBody);
        usuario.setIdUsuario(salvarUsuario.getIdUsuario());
        usuarioRepositorio.save(usuario);
    }

    public void deletarUsuario(long id) {
        usuarioRepositorio.delete(buscarPorIdUsuario(id));
    }

}