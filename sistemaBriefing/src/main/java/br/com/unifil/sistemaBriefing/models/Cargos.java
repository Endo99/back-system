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
public class Cargos implements Serializable {

    private static final long serialVersionUI = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    private long idCargo;

    private String titulo;

    private String usuario;


    @Override
    public String toString() {
        return "Cargo {" +
                "id=" + idCargo +
                ", titulo='" + titulo + '\'' +
                ", usuario='" + usuario
                + "}";
    }
}
