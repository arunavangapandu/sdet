//package com.practise.designpatterns;
//
//import com.practise.designpatterns.creationalpatterns.Book;
//
//public class BuilderPatternAppTest {
//    public static void main(String[] args) {
//        OnlineStoreAccount account = new OnlineStoreAccount.Builder(123L)
//              .withName("Aruna")
//              .withAddress("26069 Ohara lae")
//              .withBudget(99.99)
//              .withDiscountRate(1.25)
//              .build();
//
//        System.out.println(account.getName());
//
//        Book book = new Book.Builder("12345699", "wings of fire")
//                .withPrice(2.45)
//                .withAuthor("John")
//                .build();
//
//        System.out.println(book.toString());
//
//
//
//    }
//}
