package roomescape.admin.reservation;

import java.time.LocalDate;
import java.time.LocalTime;

public record ResponseReservation(Long id, String name, LocalDate date, LocalTime time) {
    public static ResponseReservation from(Reservation reservation) {
        return new ResponseReservation(
                reservation.getId(),
                reservation.getName(),
                reservation.getDate(),
                reservation.getTime()
        );
    }

}
