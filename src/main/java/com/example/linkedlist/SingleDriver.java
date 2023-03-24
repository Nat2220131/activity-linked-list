package com.example.linkedlist;

public class SingleDriver {

    public static void main(String[] args) {

        LinkedList<String> list = new SinglyLinkedList<>();

        System.out.println(list.size());

        list.addFirst("First");
        list.addFirst("Second");
        list.addFirst("Third");
        list.addFirst("Fourth");
        list.addFirst("Fifth");

        list.addLast("Sixth");
        list.addLast("Seventh");
        list.addLast("Eighth");

        System.out.println(list);
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());

        System.out.println(list.size());

        System.out.println(list.pollFirst());
        System.out.println(list);

        System.out.println(list.pollLast());
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.contains("Fifth"));
        System.out.println(list.contains("first"));
        System.out.println(list.contains("First"));
        System.out.println(list.contains("Seventh"));

        list.clear();
        System.out.println(list);

    }



}
