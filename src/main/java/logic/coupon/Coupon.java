package logic.coupon;

import java.time.LocalDateTime;

public class Coupon {
    private String id;
    private LocalDateTime expiryDate;

    public Coupon(String id, LocalDateTime expiryDate) {
        this.id = id;
        this.expiryDate = expiryDate;
    }

    private boolean validateCoupon(LocalDateTime date) {
        return date.isBefore(expiryDate);
    }

    public Coupon getCoupon(LocalDateTime date, String couponId) {
        if (id.equals(couponId)) {
            if (validateCoupon(date)) {
                return this;
            }
            return null;
        }
        return null;
    }


}
