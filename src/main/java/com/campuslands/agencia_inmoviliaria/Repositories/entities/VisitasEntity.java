package com.campuslands.agencia_inmoviliaria.Repositories.entities;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "visitas")
@AllArgsConstructor
@NoArgsConstructor
public class VisitasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_visitas")
    private Long idVisitas;
    @Column(name = "num_visitas")
    private Integer numVisitas;
    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "id_cliente")
    private List<ClienteEntity> idCliente;

}
