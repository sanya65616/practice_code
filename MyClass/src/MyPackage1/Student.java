package MyPackage1;

import java.util.*;

class Student{
    int a, b;
    String c;

    //Default Constructor
    Student(){
        System.out.println("Default Constructor!!");
        System.out.println("*************************");
    }
    //Parameterized Constructor
    Student(int roll_no,int class1, String subject){
            a= roll_no;
            b= class1;
            c= subject;
            System.out.println("Roll No. = " + a);
            System.out.println("Class = " + b);
            System.out.println("Subject  = " + c);
            System.out.println("*************************");
    }
    //Copy Constructor
    Student(Student s){
        System.out.println("Copy Constructor Called");
        a = s.a;
        b=s.b;
        c=s.c;
         System.out.println("Roll No. = " + a);
            System.out.println("Class = " + b);
            System.out.println("Subject  = " + c);
            System.out.println("*************************");
    }
    public static void main(String args[]){
        Student obj = new Student();
        Student sc = new Student(1,5,"Computer Science");
        Student copy = new Student(sc);
    }
}
