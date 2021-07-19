package br.com.acc.Controlador.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class HoursBank {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class HoursBankId implements Serializable {
        private long idHoursBank;
        private long idMovimentation;
        private long idUser;
    }
    @EmbeddedId
    private HoursBankId id;
    private LocalDateTime workDate;
    private BigDecimal amountOfWorkedHours;
    private BigDecimal balanceOfWorkedHours;

}
