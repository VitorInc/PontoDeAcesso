package br.com.acc.Controlador.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Company {
    @Id
    private Long Id;
    private String Description;
    private String Cnpj;
    private String Address;
    private String Neighborhood;
    private String Telephone;
}
