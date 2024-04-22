package roomescape.admin.reservation.dto.response;

import java.time.LocalDate;
import java.time.LocalTime;
import roomescape.admin.reservation.entity.Reservation;

public record ReservationResponse(Long id, String name, LocalDate date, LocalTime time) {
    public static ReservationResponse from(Reservation reservation) {
        return new ReservationResponse(
                reservation.getId(),
                reservation.getName(),
                reservation.getDate(),
                reservation.getTime()
        );
    }

}