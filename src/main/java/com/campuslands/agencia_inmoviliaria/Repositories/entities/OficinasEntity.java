package com.campuslands.agencia_inmoviliaria.Repositories.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "oficinas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class OficinasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOficina;
    @OneToOne()
    @JoinColumn(name = "id_zona")
    private ZonasEntity idZona;
}
