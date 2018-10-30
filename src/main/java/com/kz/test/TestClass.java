package com.kz.test;

public class TestClass {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        String a  = testClass.show("a");
    }

    /**
     * This method return new change string by template 'this -[%val%]'
     * @param val input string
     * @return 'this -[%val%]'
     */
    public String show(String val) {
        return "this -[" + val + "]";
    }
}
