package roomescape.admin.reservation.dto.response;

import java.time.LocalTime;
import roomescape.admin.reservation.entity.ReservationTime;

public record ReservationTimeResponse(Long id, LocalTime startAt) {
    public static ReservationTimeResponse from(ReservationTime reservationTime) {
        return new ReservationTimeResponse(
                reservationTime.getId(), reservationTime.getStartAt()
        );
    }
}