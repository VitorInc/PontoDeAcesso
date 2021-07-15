package br.com.acc.Controlador.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Data
public class UserCategory {
    private long id;
    private String description;

}
