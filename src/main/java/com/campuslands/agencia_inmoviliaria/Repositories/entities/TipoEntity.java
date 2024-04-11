package com.campuslands.agencia_inmoviliaria.Repositories.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tipo")
@AllArgsConstructor
@NoArgsConstructor
public class TipoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tipo")
    private Long idTipo;
    private String tipo;
    @ManyToOne
    @JoinColumn(name = "id_inmuebles_especiales")
    private List<InmuebleEspecialesEntity> idInmuebleEspecial;
    @OneToOne(mappedBy = "tipo", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private InmuebleEntity inmueble;
}
