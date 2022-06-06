package br.com.unifil.sistemaBriefing.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Cargos implements Serializable {

    private static final long serialVersionUI = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long idCargo;

    private String titulo;

    private String usuario;

}
