package br.com.unifil.sistemaBriefing.controller;

import br.com.unifil.sistemaBriefing.models.Cargos;
import br.com.unifil.sistemaBriefing.requests.CargosPostRequestBody;
import br.com.unifil.sistemaBriefing.requests.CargosPutRequestBody;
import br.com.unifil.sistemaBriefing.service.CargosServico;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cargo")
@Log4j2
@RequiredArgsConstructor
public class CargosControle {

    // Anotação
   private static final CargosServico cargosServico = null;

    // Ler

    @GetMapping(path= "list")
    public ResponseEntity<List<Cargos>> listar()
    {
        return ResponseEntity.ok(cargosServico.listarTodos());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Cargos> buscarPorId(@PathVariable long id)
    {
        return ResponseEntity.ok(cargosServico.buscarPorId(id));
    }

    @PostMapping(path = "/cadastrarCargo")
    public ResponseEntity<Cargos> cadastrarCargos(@RequestBody CargosPostRequestBody cargosPostRequestBody)
    {
        return new ResponseEntity<>(cargosServico.cadastrarCargos(cargosPostRequestBody), HttpStatus.CREATED);
    }

    @DeleteMapping(path ="/{id}")
    public ResponseEntity<Void> deletarCargo(@PathVariable long id)
    {
        cargosServico.deletarCargo(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @PutMapping(path = "/atualizarCargo")
    public ResponseEntity<Void> atualizarCargo(@RequestBody CargosPutRequestBody cargosPutRequestBody)
    {
        cargosServico.atualizarCargo(cargosPutRequestBody);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
