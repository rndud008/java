package enumeration.ref1;

public class DiscountService {
    public int discount(ClassGrade classGrade, int price){
//        int discountPercent = classGrade.getDiscountPercent();
//
//        // 10000 * (20/100) -> 2000
//        return price * discountPercent /100;

        return price * classGrade.getDiscountPercent() /100;
    }
}
