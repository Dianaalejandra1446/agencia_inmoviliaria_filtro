package com.campuslands.agencia_inmoviliaria.Repositories.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "locales")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LocalesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_locales")
    private Long idLocales;
    private Integer numeroPuertasEntrada;
    private String estadoDifano;

}
