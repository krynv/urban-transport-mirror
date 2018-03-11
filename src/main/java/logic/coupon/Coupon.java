package logic.coupon;

import java.time.LocalDateTime;

public class Coupon {
    private String id;
    private LocalDateTime expiryDate;

    public Coupon(String id, LocalDateTime expiryDate) {
        this.id = id;
        this.expiryDate = expiryDate;
    }

    /**
     * Checks that the date is before the expiry date of the coupon
     *
     * @param date from the get coupon function which is the local date
     * @return true or false whether the date of the coupon is valid
     */
    private boolean validateCoupon(LocalDateTime date) {
        return date.isBefore(expiryDate);
    }

    /**
     * Checks that the coupon id is correct
     * validates the date of the coupon to check it is valid
     * Return the the coupon if id and the date is valid.
     *
     * @param date the date is used within another to validate the coupon
     * @param couponId the couponId is used to select the coupon
     * @return the null if coupon cannot be found, returns otherwise coupon
     */
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
