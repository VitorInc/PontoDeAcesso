package br.com.acc.Controlador.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder

public class Movimentation {

    @Embeddable
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    public class MovimentationId implements Serializable{
        private long idMvmnttn;
        private long idUser;
    }
    @EmbeddedId
    private MovimentationId id;
    private LocalDateTime checkIn;
    private LocalDateTime checkOut;
    private BigDecimal period;
    private Occurrence occurrence;
    private Calendar calendar;

}
