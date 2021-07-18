package br.com.acc.Controlador.model;

import lombok.*;

import javax.persistence.ManyToOne;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Data

public class Location {
    private long id;
    @ManyToOne
    private AccessLvl accessLvl;
    private String description;
}
