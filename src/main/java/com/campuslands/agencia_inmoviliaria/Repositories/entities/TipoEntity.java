package com.campuslands.agencia_inmoviliaria.Repositories.entities;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tipo_inmueble")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    private Long idTipo;
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "id_inmuebles_especiales")
    private List<InmuebleEspecialesEntity> idInmuebleEspecial;

    @OneToOne()
    private InmuebleEntity inmueble;
}
