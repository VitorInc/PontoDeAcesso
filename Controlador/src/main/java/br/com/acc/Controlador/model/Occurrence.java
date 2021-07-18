package br.com.acc.Controlador.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder

public class Occurrence {
    private long id;
    private String name;
    private String description;

}
