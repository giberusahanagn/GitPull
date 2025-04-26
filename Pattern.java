package com.aroha.assignment;


class Patterns {
	   public static void main(String[] args) {
	  for (int i = 0; i < 4; i++) {
          for (char ch = 'A'; ch <= 'A' + i; ch++) {
              System.out.print(ch + " ");
          }
          System.out.println();
      }

	  System.out.println("-------------------------------------------");
      
      for (int i = 0; i < 4; i++) {
          char ch = (char) ('A' + i);
          for (int j = 0; j <= i; j++) {
              System.out.print(ch + " ");
          }
          System.out.println();
      }
	  System.out.println("-------------------------------------------");

     
      for (int i = 4; i > 0; i--) {
          for (char ch = 'A'; ch < 'A' + i; ch++) {
              System.out.print(ch + " ");
          }
          System.out.println();
      }
	  System.out.println("-------------------------------------------");

      
      for (char ch = 'A'; ch <= 'D'; ch++) {
          for (char c = ch; c <= 'D'; c++) {
              System.out.print(c + " ");
          }
          System.out.println();
      }
	  System.out.println("-------------------------------------------");

     
      int num = 75;
      for (int i = 1; i <= 5; i++) {
          for (int j = 0; j < i; j++) {
              System.out.print(num++ + " ");
          }
          System.out.println();
      }
	  System.out.println("-------------------------------------------");

     
      int[][] matrix = {
          {10},
          {20, 21},
          {11, 12, 13},
          {22, 23, 24, 25},
          {14, 15, 16, 17, 18}
      };
      for (int[] row : matrix) {
          for (int val : row) {
              System.out.print(val + " ");
          }
          System.out.println();
      }
  }
}