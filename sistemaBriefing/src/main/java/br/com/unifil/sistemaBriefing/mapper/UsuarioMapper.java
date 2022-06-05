package br.com.unifil.sistemaBriefing.mapper;

import br.com.unifil.sistemaBriefing.models.Usuario;
import br.com.unifil.sistemaBriefing.requests.UsuarioPostRequestBody;
import br.com.unifil.sistemaBriefing.requests.UsuarioPutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class UsuarioMapper {

    public static final UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    public abstract Usuario toUsuario(UsuarioPostRequestBody usuarioPostRequestBody);

    public abstract Usuario toUsuario(UsuarioPutRequestBody usuarioPutRequestBody);
}
