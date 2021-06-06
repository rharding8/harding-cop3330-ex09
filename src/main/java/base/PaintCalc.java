/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Harding
 */

package base;

import java.util.Scanner;

public class PaintCalc {
  Scanner input = new Scanner(System.in);
  final int conversion = 350;

  public static void main(String[] args) {
    PaintCalc paint = new PaintCalc();
    int area = paint.getArea(paint.getLength(), paint.getWidth());

    System.out.printf("You will need %d gallons of paint to cover %d square feet.%n", paint.getGallons(area), area);
  }

  public int getLength(){
    System.out.print("What is the length of the room you wish to paint? ");
    String n = input.next();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Value! Try Again!");
      return getLength();
    }
    return Integer.parseInt(n);
  }

  public int getWidth(){
    System.out.print("What is the width? ");
    String n = input.next();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Invalid Value! Try Again!");
      return getWidth();
    }
    return Integer.parseInt(n);
  }

  public int getArea(int length, int width){
    return length * width;
  }

  public int getGallons(int area){
    if (area % conversion == 0){
      return area / conversion;
    }
    else {
      return (area / conversion) + 1;
    }
  }
}
