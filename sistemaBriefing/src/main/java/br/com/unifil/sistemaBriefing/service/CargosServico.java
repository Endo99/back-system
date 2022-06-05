package br.com.unifil.sistemaBriefing.service;


import br.com.unifil.sistemaBriefing.mapper.CargosMapper;
import br.com.unifil.sistemaBriefing.models.Cargos;
import br.com.unifil.sistemaBriefing.repository.CargosRepositorio;
import br.com.unifil.sistemaBriefing.requests.CargosPostRequestBody;
import br.com.unifil.sistemaBriefing.requests.CargosPutRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CargosServico {


    private final CargosRepositorio cargoRepositorio;
    public List<Cargos> listarTodos() {
        return cargoRepositorio.findAll();
    }

    public Cargos buscarPorId(long idCargo) {
        return  cargoRepositorio.findById(idCargo)
                        .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Cargo não encontrado"));
    }

    public Cargos cadastrarCargos(CargosPostRequestBody cargosPostRequestBody)
    {
        return cargoRepositorio.save(CargosMapper.INSTANCE.toCargos(cargosPostRequestBody));
    }

    public void deletarCargo(long id) {
        cargoRepositorio.delete(buscarPorId(id));
    }

    public void atualizarCargo(CargosPutRequestBody cargosPutRequestBody) {
        Cargos salvoCargo = buscarPorId(cargosPutRequestBody.getIdCargo());
        Cargos cargos = CargosMapper.INSTANCE.toCargos(cargosPutRequestBody);
        cargos.setIdCargo(salvoCargo.getIdCargo());
        cargoRepositorio.save(cargos);
    }
}
