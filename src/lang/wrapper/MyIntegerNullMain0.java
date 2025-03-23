package lang.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr ={-1,0,1,2,3};

        System.out.println("findValue(intArr, -1) = " + findValue(intArr, -1));
        System.out.println("findValue(intArr, 0) = " + findValue(intArr, 0));
        System.out.println("findValue(intArr, 1) = " + findValue(intArr, 1));
        System.out.println("findValue(intArr, 100) = " + findValue(intArr, 100));

//        findValue(intArr, -1) = -1
//        findValue(intArr, 0) = 0
//        findValue(intArr, 1) = 1
//        findValue(intArr, 100) = -1

        // -1 이라는 값을 찾아도 -1 과 100 이라는 값을 찾는데 없으면 -1 구분이 되지 않음.
    }

    private static int findValue(int[] intArr, int target){
        for (int value : intArr){
            if (value == target){
                return value;
            }
        }

        return -1;
    }
}
