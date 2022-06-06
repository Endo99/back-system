package br.com.unifil.sistemaBriefing.requests;

import lombok.Data;

@Data
public class CargosPutRequestBody {

    private long idCargo;

    private String titulo;
}
