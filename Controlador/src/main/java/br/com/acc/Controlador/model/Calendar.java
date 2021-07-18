package br.com.acc.Controlador.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Calendar {
    private long id;
    private DateType dateType;
    private String description;
    private LocalDateTime specialDate;
}
