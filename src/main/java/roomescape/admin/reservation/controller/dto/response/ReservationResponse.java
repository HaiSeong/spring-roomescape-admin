package roomescape.admin.reservation.controller.dto.response;

import java.time.LocalDate;
import roomescape.admin.reservation.entity.Reservation;

public record ReservationResponse(Long id, String name, LocalDate date, ReservationTimeResponse time) {
    public static ReservationResponse from(Reservation reservation) {
        return new ReservationResponse(
                reservation.getId(),
                reservation.getName(),
                reservation.getDate(),
                ReservationTimeResponse.from(reservation.getTime())
        );
    }

}