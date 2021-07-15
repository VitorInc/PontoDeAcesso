package br.com.acc.Controlador.model;

import lombok.*;

import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Data

public class Location {
    private long id;
    @OneToMany
    private AccessLvl accessLvl;
    private String description;
}
