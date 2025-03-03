package network.tcp.autocloseable;

public class ResourceCloseMainV4 {

    public static void main(String[] args) {
        try {
            logic();
        } catch (CallException e) {
            System.out.println("CallException 예외처리");

            Throwable[] suppressed = e.getSuppressed();

            for (Throwable throwable : suppressed){
                System.out.println("suppressedEx = " + throwable);
            }

            throw new RuntimeException(e);
        } catch (CloseException e) {
            System.out.println("closeException 예외처리");
            throw new RuntimeException(e);
        }
    }

    private static void logic() throws CallException, CloseException {

        try (
                ResourceV2 resource1 = new ResourceV2("resource1");
                ResourceV2 resource2 = new ResourceV2("resource2");
                ){
            resource1.call();
            resource2.callEx();
            // CallException

            // resource 선언한 순서대로 닫는게 아니라 반대로 닫아준다.

        }catch (CallException e){
            System.out.println("ex: " + e);
            throw e;
        }


    }
}
