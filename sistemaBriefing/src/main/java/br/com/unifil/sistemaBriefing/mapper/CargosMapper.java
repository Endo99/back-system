package br.com.unifil.sistemaBriefing.mapper;

import br.com.unifil.sistemaBriefing.models.Cargos;
import br.com.unifil.sistemaBriefing.models.Usuario;
import br.com.unifil.sistemaBriefing.requests.CargosPostRequestBody;
import br.com.unifil.sistemaBriefing.requests.CargosPutRequestBody;
import br.com.unifil.sistemaBriefing.requests.UsuarioPostRequestBody;
import br.com.unifil.sistemaBriefing.requests.UsuarioPutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class CargosMapper {

    public static final CargosMapper INSTANCE = Mappers.getMapper(CargosMapper.class);

    public abstract Cargos toCargos(CargosPostRequestBody cargosPostRequestBody);

    public abstract Cargos toCargos(CargosPutRequestBody cargosPutRequestBody);
}