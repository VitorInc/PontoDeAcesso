package br.com.acc.Controlador.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Calendar {
    @Id
    private long id;
    private DateType dateType;
    private String description;
    private LocalDateTime specialDate;
}
