package optional;

import optional.model.Address;
import optional.model.User;

import java.util.Optional;

public class AddressMain2 {
    public static void main(String[] args) {
        User user1 = new User("user1", null);
        User user2 = new User("user2",new Address("hello street"));

        printStreet(user1);
        printStreet(user2);
    }

    private static void printStreet(User user) {
        Optional<String> userStreetOpt = getUserStreet(user);
        userStreetOpt.ifPresentOrElse(
                System.out::println
        ,() -> System.out.println("Unknown"));
    }

    static Optional<String> getUserStreet(User user){
       return Optional.ofNullable(user) // user가  null 일수 있으므로 ofNullable 사용
                .map(User::getAddress) // user.getAddress() 처리
                .map(Address::getStreet); // address.getStreet() 처리
        // 여기서 map  체이닝 중간에 null 이면 Optional.empty() 반환
    }
}
