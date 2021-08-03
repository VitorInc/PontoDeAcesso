package br.com.acc.Controlador.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@Entity

public class Movimentation {

    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public class MovimentationId implements Serializable{
        private long idMvmnttn;
        private long idUser;
    }
    @Id
    @EmbeddedId
    private MovimentationId id;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private BigDecimal period;
    @ManyToOne
    private Occurrence occurrence;
    @ManyToOne
    private Calendar calendar;

}
