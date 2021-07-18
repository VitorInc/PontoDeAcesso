package br.com.acc.Controlador.model;

import lombok.*;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class User {
    private long id;
    @ManyToOne
    private UserCategory userCategory;
    private String name;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLvl accessLvl;
    @ManyToOne
    private WorkJouney workJouney;
    private Location location;
    private BigDecimal tolerated;
}
