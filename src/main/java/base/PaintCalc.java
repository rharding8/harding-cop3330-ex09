package base;

import java.util.Scanner;

public class PaintCalc {
  Scanner input = new Scanner(System.in);
  public final int conversion = 350;

  public static void main(String[] args) {
    PaintCalc paint = new PaintCalc();

    int area = paint.getArea(paint.getLength(), paint.getWidth());

    System.out.printf("You will need %d gallons of paint to cover %d square feet.%n", paint.getGallons(area), area);
  }

  public int getLength(){
    System.out.print("What is the length of the room you wish to paint? ");
    return input.nextInt();
  }

  public int getWidth(){
    System.out.print("What is the width? ");
    return input.nextInt();
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
