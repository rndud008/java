package network.tcp.autocloseable;

public class ResourceCloseMainV2 {

    public static void main(String[] args) {
        try {
            logic();
        } catch (CallException e) {
            System.out.println("CallException 예외처리");
            throw new RuntimeException(e);
        } catch (CloseException e) {
            System.out.println("closeException 예외처리");
            throw new RuntimeException(e);
        }
    }

    private static void logic() throws CallException, CloseException {
        ResourceV1 resource1 = null;
        ResourceV1 resource2 = null;
        try {

            resource1 = new ResourceV1("resource1");
            resource2 = new ResourceV1("resource2");

            resource1.call();
            resource2.callEx(); // callException
        } catch (CallException e) {
            System.out.println("ex: " + e);
            throw e;
        } finally {
            // 자원 생성순서의 반대순서로 닫아야한다
            // 먼저 생성한것에서 참조하고 있을 가능성이 있으므로.
            if (resource2 != null) {
                resource2.closeEx();
                // 해당 로직에서 closeException 발생으로 CallException 에 대한 예외가 사라져버림
            }
            if (resource1 != null) {
                resource1.closeEx(); // 이 코드는 호출 되지 않음.
            }
        }


    }
}
