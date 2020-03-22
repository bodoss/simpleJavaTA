package com.bodos.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        System.out.println(list);
        LinkedList<String>[] arr = doMagic(list);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public static <T> LinkedList<T>[] doMagic(LinkedList<T> input) {
        Stack<T> odd = new Stack();
        Stack<T> even = new Stack();
        Iterator<T> iterator = input.iterator();
        boolean o = true;
        while (iterator.hasNext()) {
            if (o) {
                odd.push(iterator.next());
            } else {
                even.push(iterator.next());
            }
            o = !o;
        }
        LinkedList<T> resOdd = new LinkedList<>();
        LinkedList<T> resEven = new LinkedList<>();
        while (!odd.isEmpty()){
            resOdd.add(odd.pop());
        }
        while (!even.isEmpty()){
            resEven.add(even.pop());
        }
        return new LinkedList[]{resOdd, resEven};
    }
}
