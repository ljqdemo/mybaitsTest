package com.example.mybatis.demo.test;

import ch.qos.logback.core.net.QueueFactory;
import org.springframework.beans.factory.ObjectFactory;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gino
 * 2021-09-13
 */
public class Test1 {

    public static void main(String[] args) {
        /**
         * Deque  双向队列， 提供了pop 和push 的方法可以模拟栈
         */
        Deque<String> deque=new ArrayDeque();
        deque.addFirst("a");
        System.out.println(deque.getFirst());
        deque.addFirst("b");
        System.out.println(deque.getFirst());
        System.out.println("=========");
        Iterator<String> iterator = deque.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String s : deque) {
            if(s.equals("b")){
                deque.remove(s);
            }
        }
        System.out.println("=========");
        Iterator<String> iterator2 = deque.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        Map<String, String> map=new TreeMap<>();
        map.put("1","A");
        map.put("2","B");
        map.put("5","E");
        map.put("3","C");
        map.put("4","D");

        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"------"+entry.getValue());
        }

/*        deque.push("a");
        deque.push("b");
        System.out.println(deque.pop());

        System.out.println(deque.peekFirst());
        deque.pollFirst();
        System.out.println(deque.peekFirst());

        deque.offerFirst("c");
        System.out.println(deque.peekFirst());
        System.out.println(deque.getFirst());*/


        Queue queue=new QueueFactory().newLinkedBlockingDeque(15);
        queue.add("1");
        queue.add("2");
        queue.add("3");

        Iterator iterator1 = queue.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        int j=299;
        Integer k=299;
        String a="123";
        String b=new String("123");
        String c=new String("123");
        String d=a;
        String f=b;


        System.out.println(k.equals(j));
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);
        System.out.println(a==d);
        System.out.println(f==b);
    }



}
