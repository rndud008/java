package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain2 {
    public static void main(String[] args) {
        // 중복등록
        MyHashSetV2 set = new MyHashSetV2();
        MemberOnlyHash m1 = new MemberOnlyHash("A");
        MemberOnlyHash m2 = new MemberOnlyHash("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        System.out.println("System.identityHashCode(m1) = " + System.identityHashCode(m1));
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(m2));

//        m1.hashCode() = 96
//        m2.hashCode() = 96
//        m1.equals(m2) = false

        set.add(m1);
        set.add(m2);
        System.out.println("set = " + set);

        // 검색 실패
        // hashCode() 를 재정의 했기 때문에 같은 id를 사용하는  m1, m2는 같은 해시코드를 사용
        // 해시인덱스에 데이터가 저장
        // add() 로직은 중복데이터를 체크하기 때문에 같은 데이터가 저장되면 안된다
        // bucket.contains() 내부에서 데이터를 순차 비교할때 equals()를 사용
        // MemberOnlyHash는 equals()를 재정의 하지 않았으므로 Object의 equals()를 상속받아사용
        // 인스턴스의 참조값을 비교
        // 인스턴스가 서로 다른 m1, m2는 비교에 실패
        // add() 로직은 중복 데이터가 없다고 생각하고 m1, m2 를 모두 저장
        // 결과적으로 같은 회원 id를 가진 중복 데이터가 저장.

        MemberOnlyHash searchValue = new MemberOnlyHash("A");
        System.out.println("System.identityHashCode(m2) = " + System.identityHashCode(searchValue));
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
