package com.training;
import java.util.*;

import com.training.model.Student;

 

public class ApplicationForSet {
    public static void print(Set<Student> list) {
        for(Student each:list) {
                System.out.println(each);
             }
    }
    public static void main(String[] args) {
       Student ram0= new Student(114,922,"Sibas3hish1","siba12@abc.com");    
       Student ram= new Student(111,92,"Sibashish1","siba1@abc.com");    
       Student ram1= new Student(101,91,"Sibashish","siba@abc.com");    
       Student ram2= new Student(101,91,"Sibashish","siba@abc.com");
       
       // Hashset is not in sorted order and not allows duplicates.
       
       System.out.println("hashset...");
       HashSet<Student> hasSet= new HashSet<>();
       hasSet.add(ram0);
       hasSet.add(ram);
       hasSet.add(ram1);
       hasSet.add(ram2);
       
       print(hasSet);
       
       //Treeset will be in the sorted order and not allows duplicates
       
       TreeSet<Student> treeset= new TreeSet<>(); 
       treeset.add(ram0);
       treeset.add(ram);
       treeset.add(ram1);
       treeset.add(ram2);
       
       System.out.println("Treeset...");
       print(treeset);
       
       
       
       
    }
}
