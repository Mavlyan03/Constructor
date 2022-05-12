package com.company;

public class Class {
    private int number;
   private String word;
   private int[] array;

   public Class(int number, String word,int ... array) {
       this.number = number;
       System.out.println(number);
       this.word = word;
       System.out.println(word);
       this.array = array;
       for (int i : array) {
           System.out.print(i + " ");

       }

   }




}

