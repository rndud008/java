package thread.executor.test;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class OldOrderService {

    public void order(String orderNo){
        InventoryWork inventroyWork = new InventoryWork(orderNo);
        ShoppingWork shoppingWork = new ShoppingWork(orderNo);
        AccountingWork accountingWork = new AccountingWork(orderNo);

        // 작업요청
        Boolean inventoryResult = inventroyWork.call();
        Boolean shoppingResult = shoppingWork.call();
        Boolean accountingResult = accountingWork.call();

        // 결과 확인
        if (inventoryResult && shoppingResult && accountingResult){
            log("모든 주문 처리가 성고적으로 완료되었습니다.");
        }else {
            log("일부 작업이 실패했습니다.");
        }
    }

    static class InventoryWork{
        private final String orderNo;

        InventoryWork(String orderNo) {
            this.orderNo = orderNo;
        }

        public Boolean call(){
            log("재고 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class ShoppingWork{
        private final String orderNo;

        ShoppingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        public Boolean call(){
            log("배송 시스템 알림: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class AccountingWork{
        private final String orderNo;

        AccountingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        public Boolean call(){
            log("회계 시스템 알림: " + orderNo);
            sleep(1000);
            return true;
        }
    }
}
