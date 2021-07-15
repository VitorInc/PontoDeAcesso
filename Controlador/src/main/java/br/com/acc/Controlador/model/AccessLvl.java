package br.com.acc.Controlador.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Data
public class AccessLvl {
    private long Id;
    private String Description;
}
