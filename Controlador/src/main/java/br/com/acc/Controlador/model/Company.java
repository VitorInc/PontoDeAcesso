package br.com.acc.Controlador.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Data

public class Company {
    private Long Id;
    private String Description;
    private String Cnpj;
    private String Address;
    private String Neighborhood;
    private String Telephone;
}
