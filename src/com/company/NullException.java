package com.company;

public class NullException {
    static Integer generateException() {
        Integer n = null;
        return  n;
    }
}
class ThrowException {
    public static void main(String[] args){
        try {
            Integer exp = NullException.generateException();
            exp.toString();
        } catch (NullPointerException e){
            System.out.println("To jest wartość Null");
            System.out.println(e);
            e.printStackTrace();
            e.toString();
        }
    }
}


