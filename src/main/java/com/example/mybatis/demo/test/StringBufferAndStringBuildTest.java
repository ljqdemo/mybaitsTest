package com.example.mybatis.demo.test;

/**
 * @author gino
 * 2021-09-14
 */
public class StringBufferAndStringBuildTest {
    public static void main(String[] args) {
        StringBuffer buffer=new StringBuffer();
        buffer.append("1");
        StringBuilder stringBuilder = new StringBuilder();

        int[] src = {1, 2, 3, 4};
        int[] dest = new int[5];
        System.arraycopy(src, 0, dest, 1, 4);

        for (Object o : dest) {
            System.out.println(o);
        }
    }

    }
