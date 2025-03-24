package enumeration.ref3;

import enumeration.ref2.DiscountService;
import enumeration.ref2.Grade;

public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;
        enumeration.ref2.DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC, price);
        int gold = discountService.discount(Grade.GOLD, price);
        int diamond = discountService.discount(Grade.DIAMOND, price);

        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);

    }
}
