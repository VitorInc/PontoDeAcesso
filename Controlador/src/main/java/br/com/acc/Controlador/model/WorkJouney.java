package br.com.acc.Controlador.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Data
public class WorkJouney {
    private long id;
    private String description;

}
