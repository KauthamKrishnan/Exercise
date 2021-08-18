// Java Basic Exercise(https://www.w3resource.com/java-exercises/basic/index.php)

package com.CodeLove;

import java.util.Scanner;

final class Practice {

  public static void main(String[] args) {
    // 1.Print text.
    // System.out.println("Hello\nKautham");

    // 2. Print sum of two numbers.
    /*
     * final byte a = 74, b = 36; System.out.println(a + b);
     */

    // 3. Divide numbers and print screen.
    /*
     * final byte a = 10 / 5; System.out.println(a);
     */

    // 4. Write following operations.
    /*
     * final long e, f, g; e = System.nanoTime();
     * 
     * final byte a = -5 + 8 * 6, b = (55 + 9) % 9, c = 20 + -3 * 5 / 8, d = 5 + 15 / 3 * 2 - 8 % 3;
     * 
     * f = System.nanoTime();
     * 
     * g = f - e;
     * 
     * System.out.println(a + "\n" + b + "\n" + c + "\n" + d + "\nTime Elapsed: " + g);
     */

    // 5. Take two numbers from input of user and print out the product.
    // import java.util.Scanner; Use this at top

    /*
     * try { Scanner objScan = new Scanner(System.in);
     * System.out.println("Input your first number under 127.");
     * 
     * final byte a, b; a = objScan.nextByte();
     * 
     * System.out.println("Input your second number under 127."); b = objScan.nextByte();
     * 
     * final short c = (short) (a * b);
     * 
     * System.out.println(a + " x " + b + " = " + c); } catch(Exception d) {
     * System.out.println("Error occurred: " + d.getMessage()); }
     */

    // 6. Take two numbers and perform following operations.
    // import java.util.Scanner; Use this at top

    /*
     * try { Scanner objScan = new Scanner(System.in);
     * System.out.print("Input your first number under 10 000: ");
     * 
     * final short firstNum, secondNum, addResult, subResult, mulResult, divResult, remResult;
     * firstNum = objScan.nextShort();
     * 
     * System.out.
     * print("Input your second number less than the first number and also under 10 000: ");
     * secondNum = objScan.nextShort();
     * 
     * objScan.close(); final long startTime, endTime, duration; startTime = System.nanoTime();
     * 
     * addResult = (short) (firstNum + secondNum); subResult = (short) (firstNum - secondNum);
     * mulResult = (short) (firstNum * secondNum); divResult = (short) (firstNum / secondNum);
     * remResult = (short) (firstNum % secondNum);
     * 
     * endTime = System.nanoTime();
     * 
     * duration = endTime - startTime;
     * 
     * System.out.print(firstNum + " + " + secondNum + " = " + addResult + "\n" + firstNum + " - " +
     * secondNum + " = " + subResult + "\n" + firstNum + " x " + secondNum + " = " + mulResult +
     * "\n" + firstNum + " / " + secondNum + " = " + divResult + "\n" + firstNum + " mod " +
     * secondNum + " = " + remResult + "\nTime Elapsed: " + duration); } catch (Exception ex) {
     * System.out.println("Error occurred: " + ex.getMessage()); }
     */

    // 7. Take a number and get a multiplication until 10.
    // import java.util.Scanner; Use this at top
    /*
     * try { Scanner objScan = new Scanner(System.in);
     * System.out.print("Input a number under 127: ");
     * 
     * final byte a = objScan.nextByte();
     * 
     * final long startTime, endTime, duration; startTime = System.nanoTime();
     * 
     * String c = ""; for(byte i = 1; i <= 10; i++) { c += a + " x " + i + " = " + (a * i) + "\n"; }
     * 
     * endTime = System.nanoTime();
     * 
     * duration = endTime - startTime;
     * 
     * System.out.print(c + "Time Elapsed: " + duration); } catch(Exception ex) {
     * System.out.println("Error occurred: " + ex.getMessage()); }
     */

    // 8. Display pattern.
    /*
     * final long startTime, endTime, duration; startTime = System.nanoTime();
     * 
     * System.out.print("   J    a   v     v  a \n" + "   J   a a   v   v  a a\n" +
     * "J  J  aaaaa   V V  aaaaa\n" + " JJ  a     a   V  a     a\n\n");
     * 
     * endTime = System.nanoTime(); duration = endTime - startTime;
     * 
     * System.out.println("Time Elapsed: " + duration);
     */

    // 9.Compute specified expression.
    // System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));

    // 10.Compute specified formula.
    // System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) -
    // (1.0/11)));

    // 11.Print area and perimeter of a circle.
    /*
     * final long startTime, endTime, duration;
     * 
     * startTime = System.nanoTime();
     * 
     * final float radius; final double perimeter, area; radius = 7.5f; perimeter = 2d * Math.PI *
     * radius; area = Math.PI * Math.pow(radius, 2d);
     * 
     * System.out.println("Perimeter is = " + perimeter + "\n" + "Area is = " + area);
     * 
     * endTime = System.nanoTime();
     * 
     * duration = endTime - startTime;
     * 
     * System.out.println("Time Elapsed: " + duration);
     */

    // 12.Take 3 numbers and print out average.
    /*
     * System.out.println("Enter 3 numbers."); Scanner scanObj = new Scanner(System.in); short a, b,
     * c, d;
     * 
     * a = scanObj.nextShort(); b = scanObj.nextShort(); c = scanObj.nextShort();
     * 
     * scanObj.close();
     * 
     * d = (short) ((a + b + c) / 3);
     * 
     * System.out.print("The average of the 3 numbers is: " + d);
     */

    // 13.Print area and perimeter of Rectangle.
    /*
     * byte width, height, perimeter, area; width = 10; height = 5;
     * 
     * perimeter = (byte) (2 * (width + height)); area = (byte) (width * height);
     * 
     * System.out.println("Perimeter: " + perimeter + "\nArea: " + area);
     */

    // 14.Print American Flag.
    /*
     * System.out.print("* * * * * * ==================================\n" +
     * " * * * * *  ==================================\n" +
     * "* * * * * * ==================================\n" +
     * " * * * * *  ==================================\n" +
     * "* * * * * * ==================================\n" +
     * "==============================================\n" +
     * "==============================================\n" +
     * "==============================================\n" +
     * "==============================================\n");
     */

    // 15.Swap two variables.
    /*
     * byte a = 1, b = 2, c;
     * 
     * c = a; a = b; b = c;
     * 
     * System.out.println("Value of a: " + a + ", b: " + b + ", c: " + c);
     */

    // 16.Print face.
    // System.out.println(" +\"\"\"\"\"+ \n[| o o |]\n | ^ | \n | '-' | \n +-----+");

    // 17. Add two binary numbers.

    /*
     * System.out.println("Input two binary numbers.");
     * 
     * short a, b, i = 0, remainder = 0; short[] order = new short[10]; Scanner scanObj = new
     * Scanner(System.in);
     * 
     * a = scanObj.nextShort(); b = scanObj.nextShort(); scanObj.close();
     * 
     * while(a != 0 || b != 0) { order[i++] = (short) ((a % 10 + b % 10 + remainder) % 2); remainder
     * = (short) ((a % 10 + b % 10 + remainder) / 2); a = (short) (a / 10); b = (short) (b / 10); }
     * 
     * if(remainder != 0) { order[i++] = remainder; }
     * 
     * i--;
     * 
     * System.out.print("The sum of two binary numbers: ");
     * 
     * while(i >= 0) { System.out.print(order[i--]); }
     */

    // 18.Multiply two binary numbers.
    /*
     * System.out.println("Input two binary numbers."); Scanner scanObj = new Scanner(System.in);
     * short firstBinary, secBinary, multiResult = 0; byte digit, factor = 1; firstBinary =
     * scanObj.nextShort(); secBinary = scanObj.nextShort(); scanObj.close();
     * 
     * while (secBinary != 0) { digit = (byte) (secBinary % 10); if (digit == 1) { firstBinary =
     * (short) (firstBinary * factor); multiResult = binaryProduct(firstBinary, multiResult);
     * secBinary = (short) (secBinary / 10); factor = 10; } else { firstBinary = (short)
     * (firstBinary * factor); secBinary = (short) (secBinary / 10); factor = 10; } }
     * 
     * System.out.print("The product of the numbers: " + multiResult); }
     * 
     * private static short binaryProduct(short firstBinary, short multiResult) { short productValue
     * = 0; byte remainder = 0, i = 0; short[] order = new short[20];
     * 
     * while (firstBinary != 0 || multiResult != 0) { order[i++] = (short) ((firstBinary % 10 +
     * multiResult % 10 + remainder) % 2); remainder = (byte) ((firstBinary % 10 + multiResult % 10
     * + remainder) / 2); firstBinary = (short) (firstBinary / 10); multiResult = (short)
     * (multiResult / 10); }
     * 
     * --i;
     * 
     * while (i >= 0) { productValue = (short) (productValue * 10 + order[i--]); }
     * 
     * return productValue;
     */

    // 19.Convert decimal number to binary number.

    System.out.println("Input a decimal number");

    Scanner scanObj = new Scanner(System.in);
    short userNumber;
    userNumber = scanObj.nextShort();
    scanObj.close();

    short[] binaryStandard = {128, 64, 32, 16, 8, 4, 2};
    int mixer = 0;
    while (userNumber != 0) {
      if (userNumber >= binaryStandard[0]) {
        mixer = addBinary(mixer, 10000000);
        userNumber -= binaryStandard[0];
        continue;

      } else if (userNumber >= binaryStandard[1]) {
        mixer = addBinary(mixer, 1000000);
        userNumber -= binaryStandard[1];
        continue;

      } else if (userNumber >= binaryStandard[2]) {
        mixer = addBinary(mixer, 100000);
        userNumber -= binaryStandard[2];
        continue;

      } else if (userNumber >= binaryStandard[3]) {
        mixer = addBinary(mixer, 10000);
        userNumber -= binaryStandard[3];
        continue;

      } else if (userNumber >= binaryStandard[4]) {
        mixer = addBinary(mixer, 1000);
        userNumber -= binaryStandard[4];
        continue;

      } else if (userNumber >= binaryStandard[5]) {
        mixer = addBinary(mixer, 100);
        userNumber -= binaryStandard[5];
        continue;

      } else if (userNumber >= binaryStandard[6]) {
        mixer = addBinary(mixer, 10);
        userNumber -= binaryStandard[6];
        continue;

      } else if (userNumber >= 1) {
        mixer += 1;
        userNumber -= 1;
        continue;
      }
    }

    System.out.print("The binary number for the decimal: " + mixer);
  }

  private static int addBinary(int mixer, int adder) {
    int output = 0;
 
    if (mixer == adder) {
      int[] order = new int[20];
      byte remainder = 0, i = 0;
      
      while (mixer != 0 || adder != 0) {
        order[i++] = (mixer % 10 + adder % 10 + remainder) % 2;
        remainder = (byte) ((mixer % 10 + adder % 10 + remainder) / 2);
        mixer = mixer / 10;
        adder = adder / 10;
      }

      if (remainder != 0) {
        order[i++] = remainder;
      }

      --i;

      while (i >= 0) {
        output = output * 10 + order[i--];
      }
    }
    else {
      output = mixer + adder;
    }


    return output;
  }

}
