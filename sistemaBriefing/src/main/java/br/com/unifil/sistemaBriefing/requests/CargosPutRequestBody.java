package br.com.unifil.sistemaBriefing.requests;

import lombok.Data;

@Data(staticConstructor = "of")
public class CargosPutRequestBody {

    private long idCargo;

    private String titulo;
}
