package collection.set.member;

import collection.set.MyHashSetV2;

public class HashAndEqualsMain1 {
    public static void main(String[] args) {
        // 중복등록
        MyHashSetV2 set = new MyHashSetV2();
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("A");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("A");

        System.out.println("m1.hashCode() = " + m1.hashCode());
        System.out.println("m2.hashCode() = " + m2.hashCode());

        System.out.println("m1.equals(m2) = " + m1.equals(m2));
//
//        m1.hashCode() = 495053715
//        m2.hashCode() = 666641942
//        m1.equals(m2) = false

        set.add(m1);
        set.add(m2);
        System.out.println("set = " + set);

        // 검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("A");
        System.out.println("searchValue.hashCode() = " + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);
    }
}
