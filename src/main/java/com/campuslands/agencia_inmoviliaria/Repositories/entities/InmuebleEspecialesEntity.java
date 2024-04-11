package com.campuslands.agencia_inmoviliaria.Repositories.entities;

import java.util.List;

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
@Table(name = "inmuebles_especiales")
@AllArgsConstructor
@NoArgsConstructor
public class InmuebleEspecialesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inmueble_especial")
    private Long idInmuebleEspecial;
    @Column(name = "id_villa")
    @OneToMany(targetEntity = VillaEntity.class, cascade = CascadeType.ALL)
    private  List<VillaEntity> idVilla;
    @Column(name = "id_locales")
    @OneToMany(targetEntity = LocalesEntity.class, cascade = CascadeType.ALL)
    private List<LocalesEntity> idLocales;

}
