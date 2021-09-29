// Java Basic Exercise(https://www.w3resource.com/java-exercises/basic/index.php)

package com.CodeLove;

import java.io.Console;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Practice {

  static Node head;

  static class Node {
    int data;
    Node nextNode;

    Node(int d) {
      data = d;
      nextNode = null;
    }
  }

  Node reverse(Node node) {
    Node prevNode = null, currNode = node, nextNode = null;

    while (currNode != null) {
      nextNode = currNode.nextNode;
      currNode.nextNode = prevNode;
      prevNode = currNode;
      currNode = nextNode;
    }

    node = prevNode;
    return node;
  }

  void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.nextNode;
    }
  }

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

    /*
     * System.out.println("Input a decimal number");
     * 
     * Scanner scanObj = new Scanner(System.in); short userNumber; userNumber = scanObj.nextShort();
     * scanObj.close();
     * 
     * short[] binaryStandard = {128, 64, 32, 16, 8, 4, 2}; int mixer = 0; while (userNumber != 0) {
     * if (userNumber >= binaryStandard[0]) { mixer = addBinary(mixer, 10000000); userNumber -=
     * binaryStandard[0]; continue;
     * 
     * } else if (userNumber >= binaryStandard[1]) { mixer = addBinary(mixer, 1000000); userNumber
     * -= binaryStandard[1]; continue;
     * 
     * } else if (userNumber >= binaryStandard[2]) { mixer = addBinary(mixer, 100000); userNumber -=
     * binaryStandard[2]; continue;
     * 
     * } else if (userNumber >= binaryStandard[3]) { mixer = addBinary(mixer, 10000); userNumber -=
     * binaryStandard[3]; continue;
     * 
     * } else if (userNumber >= binaryStandard[4]) { mixer = addBinary(mixer, 1000); userNumber -=
     * binaryStandard[4]; continue;
     * 
     * } else if (userNumber >= binaryStandard[5]) { mixer = addBinary(mixer, 100); userNumber -=
     * binaryStandard[5]; continue;
     * 
     * } else if (userNumber >= binaryStandard[6]) { mixer = addBinary(mixer, 10); userNumber -=
     * binaryStandard[6]; continue;
     * 
     * } else if (userNumber >= 1) { mixer += 1; userNumber -= 1; continue; } }
     * 
     * System.out.print("The binary number for the decimal: " + mixer);
     */
    // 2nd Method to solve Task 19.
    /*
     * System.out.println("Input a decimal number.");
     * 
     * short userNumber; int[] order = new int[20]; Scanner scanObj = new Scanner(System.in);
     * 
     * userNumber = scanObj.nextShort(); scanObj.close();
     * 
     * byte i = 0; do { order[i++] = userNumber % 2; userNumber = (short) (userNumber / 2); } while
     * (userNumber != 0);
     * 
     * --i;
     * 
     * System.out.print("Binary number: "); while (i >= 0) { System.out.print(order[i--]);
     */

    // 20.Convert Decimal to Binary.

    /*
     * System.out.println("Input a decimal number."); Scanner scanObj = new Scanner(System.in); int
     * userNumber;
     * 
     * userNumber = scanObj.nextInt(); scanObj.close();
     * 
     * short remainder = 0; String hexString = ""; char[] hexStandard = {'0', '1', '2', '3', '4',
     * '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
     * 
     * do {
     * 
     * remainder = (short) (userNumber % 16); hexString = hexStandard[remainder] + hexString;
     * userNumber = userNumber / 16; } while (userNumber != 0);
     * 
     * System.out.print("Hexadecimal number: " + hexString);
     */

    // 21. Convert Decimal Number to Octal Number.
    /*
     * System.out.println("Input a decimal number.");
     * 
     * Scanner scanObj = new Scanner(System.in); short userNum;
     * 
     * userNum = scanObj.nextShort(); scanObj.close();
     * 
     * byte[] order = new byte[20]; byte i = 0; while(userNum != 0) { order[i++] = (byte) (userNum %
     * 8); userNum = (short) (userNum / 8); }
     * 
     * --i;
     * 
     * String result = ""; while(i >= 0) { result = result + order[i--]; }
     * 
     * System.out.print(result);
     */

    // 22.Convert binary number to decimal number.
    /*
     * System.out.println("Input binary number.");
     * 
     * Scanner scanObj = new Scanner(System.in);
     * int userNum, result = 0;
     * 
     * userNum = scanObj.nextInt();
     * scanObj.close();
     * 
     * byte[] order = new byte[8];
     * byte j = 0, i = 0;
     * short[] Base10 = {1, 2, 4, 8, 16, 32, 64, 128};
     * 
     * while (userNum > 0) {
     * order[j++] = (byte) (userNum % 10);
     * userNum = userNum / 10;
     * }
     * 
     * for(byte k: order) {
     * result += k * Base10[i++];
     * }
     * 
     * System.out.print(result);
     */

    // 23.Convert binary number to hexadecimal number.
    /*
     * System.out.print("Input a binary number:");
     * Scanner scanObj = new Scanner(System.in);
     * 
     * int userBinary = scanObj.nextInt();
     * scanObj.close();
     * 
     * byte lastDigit, j = 1;
     * short dec = 0;
     * 
     * // Convert to Decimal Number.
     * while (userBinary != 0) {
     * lastDigit = (byte) (userBinary % 10);
     * userBinary = (userBinary / 10);
     * 
     * dec += (short) (lastDigit * j);
     * j *= 2;
     * }
     * 
     * byte[] order = new byte[20];
     * byte i = 0;
     * 
     * // Convert to Hexadecimal Number.
     * while (dec != 0) {
     * order[i++] = (byte) (dec % 16);
     * dec = (short) (dec / 16);
     * }
     * 
     * // Print out the value.
     * for (--i; i >= 0; i--) {
     * if (order[i] > 9) {
     * System.out.print((char) (order[i] + 55));
     * } else {
     * System.out.print(order[i]);
     * }
     * }
     */

    // 24.Convert Binary Number to Octal Number.
    /*
     * System.out.print("Input a Binary Number:");
     * Scanner scanObj = new Scanner(System.in);
     * 
     * int userBinary = scanObj.nextInt();
     * scanObj.close();
     * 
     * short dec = 0;
     * byte j = 1;
     * 
     * // Convert Binary to Decimal.
     * while (userBinary != 0) {
     * byte lastDigit = (byte) (userBinary % 10);
     * userBinary = (userBinary / 10);
     * 
     * dec += (short) (lastDigit * j);
     * j *= 2;
     * }
     * 
     * String result = "";
     * 
     * // Convert Decimal to Octal.
     * while (dec != 0) {
     * result = String.valueOf(dec % 8) + result;
     * dec = (short) (dec / 8);
     * }
     * 
     * System.out.print(result);
     */

    // 25.Convert Octal Number to Binary Number
    /*
     * System.out.print("Input an Octal Number:");
     * Scanner scanObj = new Scanner(System.in);
     * 
     * int userOctal = scanObj.nextInt();
     * scanObj.close();
     * 
     * int dec = 0;
     * byte j = 1;
     * 
     * //Convert Octal to Decimal
     * while(userOctal > 0) {
     * byte lastDigit = (byte) (userOctal % 10);
     * userOctal = (userOctal / 10);
     * dec += (lastDigit * j);
     * j *= 8;
     * }
     * 
     * System.out.print(dec);
     */

    // 26.Convert Octal to Binary.

    /*
     * System.out.println("Input an Octal Number:");
     * Scanner scanObj = new Scanner(System.in);
     * 
     * short userOctal = scanObj.nextShort();
     * scanObj.close();
     * 
     * // Convert Octal to Decimal.
     * short dec = 0;
     * byte lastDigit, j = 1;
     * while (userOctal != 0) {
     * lastDigit = (byte) (userOctal % 10);
     * userOctal = (short) (userOctal / 10);
     * dec += (short) (lastDigit * j);
     * j *= 8;
     * }
     * 
     * String result = "";
     * 
     * // Convert Decimal to Binary.
     * while (dec != 0) {
     * result = (byte) (dec % 2) + result;
     * dec = (short) (dec / 2);
     * }
     * 
     * System.out.print(result);
     */

    // 27.Convert Octal Number to Hexadecimal Number.
    /*
     * System.out.print("Input an Octal Number:");
     * Scanner scanObj = new Scanner(System.in);
     * 
     * String userOctal = scanObj.next();
     * scanObj.close();
     * 
     * short dec = Short.parseShort(userOctal, 8);
     * String hex = Integer.toHexString(dec);
     * System.out.print(hex);
     */

    // 28.Convert Hexadecimal Number to Decimal Number.
    /*
     * System.out.print("Input a Hexadecimal Number:");
     * 
     * Scanner scanObj = new Scanner(System.in);
     * String userHex = scanObj.next();
     * scanObj.close();
     * 
     * short dec = Short.parseShort(userHex, 16);
     * System.out.print(dec);
     */

    // 29.Convert Hexadecimal Number to Binary Number.
    /*
     * System.out.print("Input a Hexadecimal Number:");
     * Scanner scanObj = new Scanner(System.in);
     * String userHex = scanObj.next();
     * scanObj.close();
     * 
     * int dec = Integer.parseInt(userHex, 16);
     * String bin = Integer.toBinaryString(dec);
     * System.out.print(bin);
     */

    // 30.Convert Hexadecimal Number to Octal Number.
    /*
     * System.out.print("Input a Hexadecimal Number:");
     * Scanner scanObj = new Scanner(System.in);
     * String userHex = scanObj.next();
     * scanObj.close();
     * 
     * int dec = Integer.parseInt(userHex, 16);
     * String octal = Integer.toOctalString(dec);
     * System.out.print(octal);
     */

    // 31.Check Java installed on your PC.
    /*
     * String javaVer, javaRuntimeVer, javaHome, javaVendor, javaVendorURL, javaClassPath;
     * 
     * javaVer = System.getProperty("java.version");
     * javaRuntimeVer = System.getProperty("java.runtime.version");
     * javaHome = System.getProperty("java.home");
     * javaVendor = System.getProperty("java.vendor");
     * javaVendorURL = System.getProperty("java.vendor.url");
     * javaClassPath = System.getProperty("java.class.path");
     * 
     * System.out.print("Java Version: " + javaVer +
     * "\nJava Runtime Version: " + javaRuntimeVer +
     * "\nJava Home: " + javaHome +
     * "\nJava Vendor: " + javaVendor +
     * "\nJava Vendor URL: " + javaVendorURL +
     * "\nJava Class Path: " + javaClassPath);
     */

    // 32.Compare two numbers.
    /*
     * System.out.println("Input two numbers for comparison.");
     * Scanner scanObj = new Scanner(System.in);
     * 
     * int firstNum, secNum;
     * firstNum = scanObj.nextInt();
     * secNum = scanObj.nextInt();
     * scanObj.close();
     * 
     * if (firstNum != secNum) {
     * System.out.println(firstNum + " != " + secNum);
     * }
     * if (firstNum < secNum) {
     * System.out.println(firstNum + " < " + secNum);
     * }
     * if (firstNum <= secNum) {
     * System.out.println(firstNum + " <= " + secNum);
     * }
     */

    // 33.Sum the digits of an integer.
    /*
     * System.out.print("Input a number: ");
     * Scanner scanObj = new Scanner(System.in);
     * int userNum = scanObj.nextInt();
     * scanObj.close();
     * 
     * int result = 0;
     * while(userNum > 0) {
     * int lastDigit = (userNum % 10);
     * userNum = (userNum / 10);
     * result += lastDigit;
     * }
     * 
     * System.out.print(result);
     */

    // 34.Compute the area of hexagon.
    /*
     * System.out.print("Input length of the hexagon side: ");
     * Scanner scanObj = new Scanner(System.in);
     * 
     * byte length = scanObj.nextByte();
     * scanObj.close();
     * double result = (6 * (length * length) / (4 * Math.tan(Math.PI / 6)));
     * 
     * System.out.print(result);
     */

    // 35.Compute area of a polygon.
    /*
     * System.out.print("Input number of sides following the length of polygon:");
     * Scanner scanObj = new Scanner(System.in);
     * int sides, length;
     * sides = scanObj.nextInt();
     * length = scanObj.nextInt();
     * scanObj.close();
     * 
     * double result = ((sides * (length * length)) / (4 * Math.tan(Math.PI / sides)));
     * System.out.print(result);
     */

    // 36.Compute distance between two points on Earth.
    /*
     * System.out.print("Input the latitude(x) of point A: ");
     * Scanner scanObj = new Scanner(System.in);
     * double xPointA = Math.toRadians(scanObj.nextDouble());
     * 
     * System.out.print("Input the longitude(y) of Point A: ");
     * double yPointA = Math.toRadians(scanObj.nextDouble());
     * 
     * System.out.print("Input the latitude(x) of Point B: ");
     * double xPointB = Math.toRadians(scanObj.nextDouble());
     * 
     * System.out.print("Input the longitude(y) of Point B: ");
     * double yPointB = Math.toRadians(scanObj.nextDouble());
     * scanObj.close();
     * 
     * double result = 6371.01d * (Math.acos(Math.sin(xPointA) * Math.sin(xPointB) +
     * (Math.cos(xPointA) * Math.cos(xPointB)) * Math.cos(yPointA - yPointB)));
     * System.out.print(result);
     */

    // 37.Reverse a string.

    /*
     * System.out.print("Input a string: ");
     * Scanner scanObj = new Scanner(System.in);
     * 
     * String userString = scanObj.next();
     * scanObj.close();
     * 
     * StringBuilder buildObj = new StringBuilder();
     * 
     * buildObj.append(userString);
     * System.out.print(buildObj.reverse());
     */

    // 38.Count letters, numbers, spaces, other.
    /*
     * System.out.print("Input a sentence: ");
     * Scanner scanObj = new Scanner(System.in);
     * 
     * char[] userSentence = scanObj.nextLine().toCharArray();
     * // String UserSentence = scanObj.nextLine();
     * scanObj.close();
     * 
     * int alphabet = 0, space = 0, digit = 0, other = 0;
     * 
     * for (char i : userSentence) {
     * if (Character.isDigit(i)) {
     * digit++;
     * } else if (Character.isSpaceChar(i)) {
     * space++;
     * } else if (Character.isAlphabetic(i)) {
     * alphabet++;
     * } else {
     * other++;
     * }
     * }
     * 
     * System.out.print("Digit: " + digit + "\nSpace: " + space + "\nAlphabet: " + alphabet +
     * "\nOther: " + other);
     */

    // 39.Create unique numbers with 4 digits and count it.

    /*
     * short count = 0;
     * 
     * for (byte i = 1; i < 5; i++) {
     * for (byte j = 1; j < 5; j++) {
     * for (byte k = 1; k < 5; k++) {
     * if (i != j && j != k && k != i) {
     * String result = i + "" + j + "" + k;
     * System.out.println(result);
     * count++;
     * }
     * }
     * }
     * }
     * 
     * System.out.print("Number of occurence: " + count);
     */

    // 40.List available characters in charset objects.
    /*
     * for(String charSets:Charset.availableCharsets().keySet()) {
     * System.out.println(charSets);
     * }
     */


    // 41.Print the ASCII value of a given character.

    /*
     * System.out.print("Input a character: ");
     * Scanner scanObj = new Scanner(System.in);
     * char userChar = scanObj.next().charAt(0);
     * scanObj.close();
     * 
     * System.out.print((int) userChar);
     */

    // 42.Input and display password.
    /*
     * Console cons;
     * if ((cons = System.console()) != null) {
     * char[] pass_ward = null;
     * try {
     * pass_ward = cons.readPassword("Input your Password:");
     * System.out.println("Your password was: " + new String(pass_ward));
     * } finally {
     * if (pass_ward != null) {
     * java.util.Arrays.fill(pass_ward, ' ');
     * }
     * }
     * } else {
     * throw new RuntimeException("Can't get password...No console");
     * }
     */

    // 43.Write String in specific format.
    /*
     * System.out.
     * println("Twinkle, twinkle, little star,\n\tHow I wonder what you are!\n\t\tUp above the world so high,"
     * );
     * System.out.
     * println("\t\tLike a diamond in the sky.\nTwinkle, twinkle, little star,\n\tHow I wonder what you are"
     * );
     */

    // 44.Input a number and print value of (n + nn + nnn).
    /*
     * System.out.print("Input a number: ");
     * Scanner scanObj = new Scanner(System.in);
     * short userNum = scanObj.nextShort();
     * scanObj.close();
     * 
     * String secNum = userNum + "" + userNum;
     * String thirdNum = userNum + "" + userNum + "" +userNum;
     * 
     * int result = userNum + Integer.valueOf(secNum) + Integer.valueOf(thirdNum);
     * System.out.print(result);
     */

    // 45.Find the size of a specified file.
    /*
     * System.out.print("Input the path for the file: ");
     * Scanner scanObj = new Scanner(System.in);
     * String path = scanObj.nextLine();
     * scanObj.close();
     * 
     * File myFile = new File(path);
     * 
     * if(myFile.exists()) {
     * System.out.print("File Size: " + myFile.length() + " bytes");
     * }
     * else {
     * System.out.print("File does not exist.");
     * }
     */

    // 46.Display the system time.
    /*
     * LocalDateTime myTime = LocalDateTime.now();
     * 
     * System.out.print(myTime);
     * System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
     */

    // 47.Write current date time in specific format.
    /*
     * LocalDateTime myTime = LocalDateTime.now();
     * DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");
     * 
     * System.out.print(myTime.format(myFormat));
     */

    // 48.Odd Numbers from 1 to 99.
    /*
     * for(byte i=1;i<100;i+=2) {
     * System.out.println(i);
     * }
     */

    // 49.Take number and check if odd(0) or even(1)
    /*
     * System.out.print("Input a number: ");
     * Scanner myScan = new Scanner(System.in);
     * byte userNum = myScan.nextByte();
     * myScan.close();
     * 
     * byte result = (byte) (userNum % 2);
     * 
     * switch (result) {
     * case 0:
     * System.out.print("Even");
     * break;
     * case 1:
     * System.out.print("Odd");
     * break;
     * }
     */

    // 50.Print numbers divisible by 3, 5 and both.
    // ArrayList<Byte> divThree = new ArrayList<Byte>();
    // ArrayList<Byte> divFive = new ArrayList<Byte>();
    // ArrayList<Byte> divBoth = new ArrayList<Byte>();

    /*
     * String divThree = "", divFive = "", divBoth = "";
     * 
     * byte threeResult, fiveResult;
     * 
     * for (byte i = 1; i < 100; i++) {
     * threeResult = (byte) (i % 3);
     * if (threeResult == 0) {
     * // divThree.add(i);
     * divThree += i + ", ";
     * }
     * 
     * fiveResult = (byte) (i % 5);
     * if (fiveResult == 0) {
     * divFive += i + ", ";
     * }
     * 
     * if (threeResult == 0 && fiveResult == 0) {
     * divBoth += i + ", ";
     * }
     * }
     * 
     * if (divThree != "") {
     * divThree = Trimmer(divThree);
     * }
     * 
     * if(divFive != "") {
     * divFive = Trimmer(divFive);
     * }
     * 
     * if(divBoth != "") {
     * divBoth = Trimmer(divBoth);
     * }
     * 
     * System.out.print("Divided by 3: " + divThree + "\nDivided by 5: " + divFive + "\nDivided by Both: " + divBoth);
     */

    // 51.String to Integer.
    /*
     * System.out.print("Input a number(String): ");
     * Scanner myScan = new Scanner(System.in);
     * String userStringNum = myScan.next();
     * myScan.close();
     * 
     * System.out.print("The Integer value of the String: " + Integer.valueOf(userStringNum));
     */

    // 52.Sum two integer and return true if it is the third integer.
    /*
     * System.out.print("Input first integer: ");
     * Scanner myScan = new Scanner(System.in);
     * byte firstNum = myScan.nextByte();
     * 
     * System.out.print("Input second integer: ");
     * byte secNum = myScan.nextByte();
     * 
     * System.out.print("Input third integer: ");
     * byte thirdNum = myScan.nextByte();
     * myScan.close();
     * 
     * short result = (short) (firstNum + secNum);
     * if (result == thirdNum) {
     * System.out.print("The result is: true");
     * }
     */

    // 53. Accept three integers and return true if (2nd > 1st) && (3rd > 2nd). If abc true, (2nd > 1st) no need to be
    // true.
    /*
     * System.out.print("Input 1st number: ");
     * Scanner myScan = new Scanner(System.in);
     * byte firstNum = myScan.nextByte();
     * 
     * System.out.print("Input 2nd number: ");
     * byte secNum = myScan.nextByte();
     * 
     * System.out.print("Input 3rd number: ");
     * byte thirdNum = myScan.nextByte();
     * myScan.close();
     * boolean abc = false;
     * 
     * if(abc) {
     * System.out.print("The result is: " + (thirdNum > secNum));
     * }
     * else {
     * System.out.print("The result is: " + (secNum > firstNum && thirdNum > secNum));
     * }
     */

    // 54.Accept 3 digits and return true if 2>= of them have the same rightmost digit.
    /*
     * System.out.print("Input 1st number: ");
     * Scanner myScan = new Scanner(System.in);
     * byte a = myScan.nextByte();
     * 
     * System.out.print("Input 2nd number: ");
     * byte b = myScan.nextByte();
     * 
     * System.out.print("Input 3rd number: ");
     * byte c = myScan.nextByte();
     * myScan.close();
     * 
     * System.out.print("The result is: " + Checker(a,b,c));
     */

    // 55.Convert seconds to hours, minute and seconds.
    /*
     * System.out.println("Input seconds: ");
     * Scanner myScan = new Scanner(System.in);
     * short seconds = myScan.nextShort();
     * myScan.close();
     * 
     * int hours = (seconds / 3600);
     * int minutes = ((seconds % 3600) / 60);
     * int secondsExtracted = ((seconds % 3600) % 60);
     * 
     * System.out.println(hours + ":" + minutes + ":" + secondsExtracted);
     */

    // 56.Number of Integers between two numbers and divisible by a number.
    /*
     * byte a = 5, b = 20, c = 3;
     * String result = "";
     * for(int i = a;i<=b;i++) {
     * if(i % c == 0) {
     * result += i + ",";
     * }
     * }
     * 
     * System.out.print(result);
     */

    // 57.Accept and integer and count the factor.
    /*
     * System.out.print("Input a number: ");
     * Scanner myScan = new Scanner(System.in);
     * int a = myScan.nextInt();
     * myScan.close();
     * 
     * int count = 0;
     * for (int i = 1; i <= a; i++) {
     * if(a % i == 0) {
     * count++;
     * }
     * }
     * System.out.print(count)
     */

    // 58.Capitalize first letter of each word in a sentence.
    /*
     * System.out.print("Input a sentence: ");
     * Scanner myScan = new Scanner(System.in);
     * String sentence = myScan.nextLine();
     * myScan.close();
     * 
     * String[] words = sentence.split(" ");
     * String sentenceMod = "";
     * for(String i:words) {
     * sentenceMod += i.substring(0,1).toUpperCase() + i.substring(1) + " ";
     * }
     * System.out.print(sentenceMod);
     */

    // 59.Convert sentence to lowercase.
    /*
     * System.out.println("Input a sentence: ");
     * Scanner myScan = new Scanner(System.in);
     * String sentence = myScan.nextLine();
     * myScan.close();
     * 
     * System.out.println(sentence.toLowerCase());
     */

    // 60.Find the penultimate word of a sentence.
    /*
     * System.out.println("Input a sentence: ");
     * Scanner myScan = new Scanner(System.in);
     * String sentence = myScan.nextLine();
     * myScan.close();
     * 
     * String[] words = sentence.split(" ");
     * System.out.print(words[words.length - 2]);
     */

    // 61.Reverse a word.
    /*
     * System.out.println("Input a sentence: ");
     * Scanner myScan = new Scanner(System.in);
     * String word = myScan.next();
     * myScan.close();
     * 
     * StringBuilder build = new StringBuilder();
     * build.append(word);
     * System.out.println(build.reverse());
     */

    // 62.Accept 3 integer and return true if one of them is 20> and less than the substraction of others.
    /*
     * System.out.print("Input 1st number: ");
     * Scanner myScan = new Scanner(System.in);
     * short a = myScan.nextShort();
     * 
     * System.out.print("Input 2nd number: ");
     * short b = myScan.nextShort();
     * 
     * System.out.print("Input 3rd number: ");
     * short c = myScan.nextShort();
     * myScan.close();
     * 
     * System.out.println((Math.abs(a - b) >= 20 || Math.abs(b - c) >= 20 || Math.abs(c - a) >= 20));
     */

    // System.out.print("The result is: " + Checker(a, b, c));
    // 63.Accept 2 integer return the largest value. If the two values are the same, return 0,
    // return the smaller value if the two values have the same remainder when divided by 6.

    /*
     * System.out.print("Input 1st number: ");
     * Scanner myScan = new Scanner(System.in);
     * short firstNum = myScan.nextShort();
     * 
     * System.out.print("Input 2nd number: ");
     * short secNum = myScan.nextShort();
     * myScan.close();
     * 
     * if (firstNum != secNum) {
     * System.out.println("Larger Value: " + Math.max(firstNum, secNum));
     * } else {
     * System.out.println("0");
     * int divRes1 = (firstNum % 6);
     * int divRes2 = (secNum % 6);
     * if(divRes1 == divRes2) {
     * System.out.println(Math.min(firstNum, secNum));
     * }
     * }
     */

    // 64.Accept two integer from 25 to 75 and return true if both numbers have common digit.
    /*
     * System.out.print("Input first number: ");
     * Scanner myScan = new Scanner(System.in);
     * int firstNum = myScan.nextInt();
     * 
     * System.out.print("Input second number: ");
     * int secNum = myScan.nextInt();
     * myScan.close();
     * 
     * System.out.println("Value is: " + Checker(firstNum,secNum));
     */


    // 65.Calculate modules of two numbers without any inbuilt modulus operator.
    /*
     * System.out.print("Input first number: ");
     * Scanner myScan = new Scanner(System.in);
     * int firstNum = myScan.nextInt();
     * 
     * System.out.print("Input first number: ");
     * int secNum = myScan.nextInt();
     * myScan.close();
     * 
     * int dividend = (firstNum/secNum);
     * int value = (dividend * secNum);
     * System.out.println(firstNum - value);
     */

    // 66.Compute the sum of the first 100 prime numbers.
    /*
     * int sum = 1;
     * int ctr = 0;
     * int n = 1;
     * String primeNumbers = "2 ";
     * 
     * while (ctr < 100) {
     * n++;
     * if (n % 2 != 0) {
     * // check if the number is even
     * if (is_Prime(n)) {
     * primeNumbers = primeNumbers + n + " ";
     * }
     * }
     * ctr++;
     * }
     * System.out.println("\nSum of the prime numbers till 100: " + primeNumbers);
     */


    // 67.Insert a word in the middle of a String.Python "Tutorial" 3.0
    /*
     * StringBuilder build = new StringBuilder();
     * String sentence = "Python 3.0";
     * String[] words = sentence.split(" ");
     * build.append(words[0] + " Tutorial " + words[1]);
     * System.out.println(build.toString());
     */

    // 68.Write 4 copies of the last 3 character of an original string. Length of original string must be more than 3
    // characters.
    /*
     * String original = "Python Tutorial 3.0";
     * String changed = original.substring(original.length() - 3);
     * 
     * original = "";
     * for(byte i = 0;i<4;i++) {
     * original += changed;
     * }
     * 
     * System.out.println(original);
     */

    // 69.Extract the first half of an even length.
    /*
     * String sentence = "Python";
     * sentence = sentence.substring(0,sentence.length()/2);
     * System.out.println(sentence);
     */

    // 70.Create a String in the form short + long + short from two String. The Strings must not have same length.
    /*
     * String python = "Python";
     * String tutorial = "Tutorial";
     * 
     * byte large = (byte) Math.max(python.length(), tutorial.length());
     * if (large == tutorial.length()) {
     * System.out.println(python+tutorial+python);
     * } else {
     * System.out.println(tutorial+python+tutorial);
     * }
     */

    // 71.Join two Strings with their first character removed.
    /*
     * String python = "Python";
     * String tutorial = "Tutorial";
     * StringBuilder build = new StringBuilder();
     * build.append(python);
     * build.deleteCharAt(0);
     * byte length =(byte) build.length();
     * build.append(tutorial);
     * build.deleteCharAt(length);
     * System.out.print(build.toString());
     */

    // 72.Create new string taking first 3 characters from given string.If given string length less than 3 use '#' as
    // substitute.
    /*
     * String string = "Py";
     * int length = string.length();
     * 
     * if (length > 4) {
     * System.out.println(string.substring(0, 3).toString());
     * } else {
     * byte ash = (byte) Math.abs(length - 3);
     * 
     * for (byte i = 0; i < ash; i++) {
     * string += "#";
     * }
     * 
     * System.out.println(string);
     * }
     */

    // 73.Create new string taking first and last characters from two given strings. if length of either string is 0 use
    // '#'.
    /*
     * String python = "";
     * String tutorial = "Tutorial";
     * String result = "";
     * if (python.length() == 0 || tutorial.length() == 0) {
     * if(python.length() == 0) {
     * result = "#" + tutorial.substring(0,1);
     * System.out.println(result);
     * }
     * else
     * {
     * result = python.substring(0,1) + "#";
     * System.out.println(result);
     * }
     * } else {
     * result += python.substring(0, 1);
     * result += tutorial.substring(tutorial.length() - 1);
     * System.out.println(result);
     * }
     */

    // 74.Test 10 appears in the first or last element of an integer array and array must be more than or equal to 2.
    /*
     * byte[] numbers = {10, 5, 4, 3, 2, 5, 6, 4};
     * if (numbers.length >= 2) {
     * System.out.println((numbers[0] == 10 || numbers[numbers.length - 1] == 10));
     * } else {
     * System.out.println("false");
     * }
     */

    // 75.Test first and last element of an integer array are same and array must be more than or equal to 2.
    /*
     * byte[] numbers = {5,10,15,20};
     * if(numbers.length >= 2) {
     * byte firstInt = numbers[0];
     * byte lastInt = numbers[numbers.length - 1];
     * System.out.println(firstInt == lastInt);
     * }
     * else
     * {
     * System.out.println("false");
     * }
     */

    // 76.Test first and last element of two integer arrays are the same and array must be more than or equal to 2.
    /*
     * byte[] number1 = {1,2,3,4,5,6};
     * byte[] number2 = {7,8,9,10,11};
     * System.out.println((number1[0] == number2[0] && number1[number1.length - 1] == number2[number2.length - 1]));
     */

    // 77.Create an array with length of 2 from 2 integer arrays with 3 elements and the new array will contain the
    // first and last elements from the 2 arrays.
    /*
     * byte[] number1 = {1, 2, 3};
     * byte[] number2 = {7, 8, 9};
     * byte[] newArray = {number1[0],number2[number2.length-1]};
     * System.out.println(newArray[0] + "," + newArray[1]);
     */

    // 78.Test integer array length 2 contains a 4 or a 7.
    /*
     * int[] number1 = {1, 2};
     * System.out.println(Arrays.stream(number1).anyMatch(x -> (x == 4)||(x == 7)));
     */

    // 79.Rotate an integer array length 3 in left direction.
    /*
     * int[] number1 = {1, 2, 3};
     * int[] number2 = {number1[1], number1[2], number1[0]};
     * System.out.println(Arrays.toString(number2));
     */

    // 80.Get larger value between first and last element of an integer array with length 3.
    /*
     * int[] number1 = {1, 2, 3};
     * System.out.println(Math.max(number1[0], number1[number1.length-1]));
     */

    // 81.Swap first and last element of an array with length of 3 and create a new array.
    /*
     * int[] number1 = {1, 2, 3};
     * int[] number2 = {number1[number1.length - 1], number1[1], number1[0]};
     * System.out.println(Arrays.toString(number2));
     */

    // 82.Find largest element between first, last and middle values from an integer array.
    /*
     * int[] number1 = {5,4,3,2,1};
     * int max = 0;
     * for(int number:number1) {
     * if(number > max) {
     * max = number;
     * }
     * }
     * System.out.println(max);
     */

    // 83.Multiply corresponding elements of two integer arrays.
    /*
     * byte[] number1 = {1, 3, -5, 4};
     * byte[] number2 = {1, 4, -5, -2};
     * String numbers = "";
     * for(byte i = 0;i < number1.length;i++) {
     * numbers += number1[i] * number2[i] + " ";
     * }
     * 
     * System.out.println(numbers);
     */

    // 84.Take last 3 characters from a given string and add the 3 characters at front and back of the string.String >=
    // 3
    /*
     * String word = "Python";
     * String substring = word.substring(word.length()-3);
     * System.out.println(substring + word + substring);
     */

    // 85.Check if a string starts with a specified word.
    /*
     * String sentence = "Hello how are you?";
     * System.out.println(sentence.startsWith("Hello"));
     */

    // 86.Start with integer n,divide n by 2 if n is even || add 1 if n is odd, repeat the process until n = 1;
    /*
     * byte n = 5;
     * 
     * while (n != 1) {
     * byte remainder = (byte) (n % 2);
     * if (0 == remainder) {
     * n = (byte) (n / 2);
     * } else {
     * n += 1;
     * }
     * }
     */

    // 87.Read an integer and calculate the sum of its digits.
    /*
     * String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
     * byte num = 89;
     * byte addedNum = 0;
     * String numbersSpell = "";
     * while (num != 0) {
     * byte digit = (byte) (num % 10);
     * num = (byte) (num / 10);
     * addedNum += digit;
     * numbersSpell = numbers[digit] + " " + numbersSpell;
     * }
     * System.out.println(addedNum);
     * System.out.println(numbersSpell);
     */

    // 88.Get current system environment and system properties.
    /*
     * System.out.println(System.getenv());
     * System.out.println(System.getProperties());
     */

    // 89.Check whether a security manager already established for current application or not.
    // System.out.println(System.getSecurityManager());

    // 90.Get the value of the environment variable PATH, TEMP, USERNAME
    /*
     * System.out.println(System.getenv("PATH"));
     * System.out.println(System.getenv("TEMP"));
     * System.out.println(System.getenv("USERNAME"));
     */

    // 91.Measure how long some code takes to execute in nanoseconds
    /*
     * long start = System.nanoTime();
     * System.out.println(System.getenv("PATH"));
     * System.out.println(System.getenv("TEMP"));
     * System.out.println(System.getenv("USERNAME"));
     * long end = System.nanoTime();
     * long duration = (end - start);
     * System.out.println("Time elapsed: " + duration + " nanoseconds");
     */

    // 92.Count the number of even and odd elements in a given integer array.
    /*
     * int[] numbers = {1,2,3,4,5,6,7,8,9,10};
     * int even = 0, odd = 0;
     * for(int number:numbers) {
     * int value = (number % 2);
     * 
     * if(value == 0) {
     * even++;
     * }
     * else {
     * odd++;
     * }
     * }
     * System.out.print("Even: " + even + "\nOdd: " + odd);
     */

    // 93.Test if integer array contains an element 10 next to 10 or an element 20 next to 20 but not both.
    /*
     * int[] numbers = {5,10,10,20,25,30};
     * boolean number1010 = false,number2020 = false;
     * if(Arrays.stream(numbers).anyMatch(x -> x == 10)) {
     * int i = Arrays.binarySearch(numbers,10);
     * number1010 = (numbers[--i] == 10);
     * }
     * 
     * if(Arrays.stream(numbers).anyMatch(x -> x == 20)) {
     * int i = Arrays.binarySearch(numbers,20);
     * number2020 = (numbers[--i] == 20);
     * }
     * 
     * System.out.println(String.valueOf(number1010 != number2020));
     */
    // 94.Rearrange all elements in a given integer array so that all odd numbers come before all even numbers.
    /*
     * int[] numbers = {1,2,3,4,5,6,7,8,9,10};
     * byte secRemainder = 0, j = 0;
     * 
     * System.out.println("Original Array: " + Arrays.toString(numbers));
     * 
     * for (byte i = 0; i < numbers.length - 1; i++) {
     * byte remainder = (byte) (numbers[i] % 2);
     * if (remainder == 0) {
     * if (j == i + 1 || ((j > 0) && (i > 0) && j == i))
     * break;
     * j = 1;
     * while (secRemainder == 0) {
     * secRemainder = (byte) (numbers[numbers.length - j] % 2);
     * j++;
     * }
     * secRemainder = 0;
     * --j;
     * j = (byte) (numbers.length - j);
     * int temp = numbers[j];
     * numbers[j] = numbers[i];
     * numbers[i] = temp;
     * }
     * }
     * 
     * System.out.println("Modifed Array: " + Arrays.toString(numbers));
     */

    // 95.Create string array through n-1.(Length # 0)
    /*
     * byte n = 5;
     * String[] numbers = new String[n];
     * 
     * for(byte i = 0;i<n;i++) {
     * numbers[i] = String.valueOf(i);
     * }
     * System.out.println(Arrays.toString(numbers));
     */

    // 96.Check if there is a 10 in given integer array with a 20 somewhere later in the array.
    /*
     * int[] numbers = {5, 10, 15, 20, 25};
     * 
     * for (byte i = 0; i < (byte) (numbers.length - 1); i++) {
     * if (numbers[i] == 10) {
     * for (byte j = ++i; j < (numbers.length - 1); j++) {
     * if (numbers[j] == 20) {
     * System.out.println("True");
     * break;
     * }
     * }
     * break;
     * }
     * }
     */

    // 97.Check integer array contains a specified number next to each other || there are 2 same specified number
    // separated by 1 element
    /*
     * int[] numbers = {10, 10, 15, 10, 20, 10, 50};
     * 
     * int number = 50;
     * 
     * for(int i = 0; i<numbers.length-1;i++) {
     * if((numbers[i] == number && numbers[i+1] == number) || (numbers[i] == number && numbers[i+2] == number)) {
     * System.out.println("True");
     * break;
     * }
     * }
     */

    // 98.check 20 appears 3 times && no 20s are next to each other in an integer array.
    /*
     * int[] numbers = {10, 20, 10, 20, 40, 13, 20};
     * byte count = 0;
     * boolean result = false;
     * for (byte i = 0; i < numbers.length; i++) {
     * if (numbers[i] == 20)
     * if (numbers.length == i+1||(numbers[i+1] != 20)) {
     * count++;
     * } else {
     * result = false;
     * break;
     * }
     * 
     * if (count >= 3) {
     * result = true;
     * break;
     * }
     * }
     * 
     * System.out.println(result);
     */

    // 99.Check specified number appears in every pair of adjacent element in given integer array.
    /*
     * int[] numbers = {10, 15, 10, 20, 40, 20, 50};
     * int number = 20;
     * boolean result = false;
     * 
     * for(byte i = 1; i < numbers.length;i++) {
     * if(numbers[i] == number || numbers[i-1] == number)
     * result = true;
     * else {
     * result = false;
     * break;
     * }
     * }
     * 
     * System.out.println(result);
     */

    // 100.Count 2 elements of given 2 integer arrays with same length differ by 1 or less.
    /*
     * int[] number1 = {10, 11, 10, 20, 43, 20, 50}, number2 = {10, 13, 11, 20, 44, 30, 50};
     * int count = 0;
     * for (byte i = 0; i < number1.length; i++) {
     * if (Math.abs(number1[i] - number2[i]) == 1) {
     * count++;
     * }
     * }
     * System.out.println(count);
     */

    // 101.Check if the number of 10 is greater than number to 20s in given integer array.
    /*
     * int[] numbers = {10, 11, 10, 20, 43, 20, 50};
     * int count10 = 0, count20 = 0;
     * for (int i = 0; i < numbers.length; i++) {
     * if (numbers[i] == 10)
     * count10++;
     * 
     * if (numbers[i] == 20)
     * count20++;
     * }
     * 
     * System.out.println(count10 > count20);
     */


    // 102.Check integer array contains 10s or 30s.
    /*
     * int[] numbers = {11, 11, 13, 31, 45, 20, 33, 53};
     * for (byte i = 0; i < numbers.length; i++) {
     * if (numbers[i] == 10 || numbers[i] == 30) {
     * System.out.println("True");
     * break;
     * }
     * }
     */

    // 103.Create a new array from given integer array, take all element after 10.
    /*
     * int[] numbers = {11, 10, 13, 10, 45, 20, 33, 53};
     * int index = 0;
     * boolean has10 = false;
     * for (int i = numbers.length - 1; i != 0; i--) {
     * if (numbers[i] == 10) {
     * index = i;
     * has10 = true;
     * break;
     * }
     * }
     * 
     * if (has10) {
     * int[] newNumbers = Arrays.copyOfRange(numbers, index + 1, numbers.length);
     * System.out.println(Arrays.toString(newNumbers));
     * }
     */



    // 104.Create a new array from given integer array, take all element before 10.
    /*
     * int[] numbers = {11, 10, 13, 10, 45, 20, 33, 53};
     * int j = 0;
     * boolean has10 = false;
     * for (int i = numbers.length - 1; i > 0; i--) {
     * if(numbers[i] == 10) {
     * j = i;
     * has10 = true;
     * break;
     * }
     * }
     * 
     * if(has10) {
     * int[] newNumbers = Arrays.copyOfRange(numbers, 0, j);
     * System.out.println(Arrays.toString(newNumbers));
     * }
     */

    // 105.Check if a group of numbers(l) at the start and the end of given array are same.
    /*
     * int[] numbers = {30, 35, 5, 10, 15, 20, 25, 33, 35};
     * int[] groupNumbers = {30, 35};
     * boolean result = false;
     * 
     * if ((numbers[0] == groupNumbers[0]) && (numbers[1] == groupNumbers[1]))
     * result = true;
     * else
     * result = false;
     * 
     * if ((numbers[numbers.length - 1] == groupNumbers[groupNumbers.length - 1])
     * && (numbers[numbers.length - 2] == groupNumbers[groupNumbers.length - 2]))
     * result = true;
     * else
     * result = false;
     * 
     * System.out.println(result);
     */

    // 106.Create new array that is left shifted from given integer array.
    /*
     * int[] numbers = {11, 15, 13, 10, 45, 20};
     * System.out.println(Arrays.toString(numbers));
     * 
     * int temp = 0;
     * temp = numbers[0];
     * 
     * for(byte i = 0; i < numbers.length-1;i++) {
     * numbers[i] = numbers[i+1];
     * }
     * 
     * numbers[numbers.length-1] = temp;
     * 
     * System.out.println(Arrays.toString(numbers));
     */

    // 107.Check integer array contain 3 increasing adjacent numbers.
    /*
     * int[] numbers = {10, 12, 13, 14, 15, 20};
     * for (byte i = 3; i < numbers.length; i++) {
     * if ((numbers[i - 3] + 1 == numbers[i - 2]) && (numbers[i - 2] + 1 == numbers[i - 1]) && (numbers[i-1] + 1 ==
     * numbers[i])) {
     * System.out.println("True");
     * break;
     * }
     * }
     */


    // 108.Add all the digits of given positive integer until the result has single digit.
    /*
     * int number = 567;
     * int sum = 0;
     * 
     * while (number > 0) {
     * sum += number % 10;
     * number = number / 10;
     * }
     * 
     * System.out.println(sum);
     */

    // 109.Form a staircase shape of n coins where every k-th row must have exactly k coins.
    /*
     * System.out.println("Input an integer: ");
     * Scanner myScan = new Scanner(System.in);
     * int number = myScan.nextInt();
     * myScan.close();
     * 
     * for (int i = 1; number > 0; i++) {
     * int counter = number - i;
     * if (counter < 0) {
     * while(number > 0) {
     * System.out.print("$");
     * number--;
     * }
     * } else {
     * int repeat = number - counter;
     * while (repeat > 0) {
     * System.out.print("$");
     * repeat--;
     * }
     * System.out.print("\n");
     * number = counter;
     * }
     * 
     * }
     */

    // 110.Check given integer is power of 4 or not. num = 64, true. num = 6, false.
    /*
     * System.out.println("Input a number: ");
     * Scanner myScan = new Scanner(System.in);
     * int number = myScan.nextInt();
     * myScan.close();
     * 
     * for (int i = 4; i <= number; i *= 4) {
     * if (i == number) {
     * System.out.println("True");
     * break;
     * }
     * 
     * }
     */

    // 111.Add two numbers without using any arithmetic.
    /*
     * System.out.println("Input first number: ");
     * Scanner myScan = new Scanner(System.in);
     * int firstNum = myScan.nextInt();
     * int secNum = myScan.nextInt();
     * myScan.close();
     * 
     * //Basically they using the bits to compute this which called "Bitwise".
     * 
     * while(secNum != 0){
     * int carry = firstNum & secNum;
     * firstNum = firstNum ^ secNum;
     * secNum = carry << 1;
     * }
     * 
     * System.out.println(firstNum);
     */

    // 112.Compute the number of trailing zeros in a factorial.
    /*
     * System.out.println("Input a number: ");
     * Scanner myScan = new Scanner(System.in);
     * long number = myScan.nextLong();
     * myScan.close();
     * int count = 0;
     * for (int temp =(int) number; temp > 1 ; temp--) {
     * number *= (temp-1);
     * }
     * 
     * long tempNumber = number;
     * while(tempNumber % 10 == 0) {
     * count++;
     * tempNumber = tempNumber /10;
     * }
     * System.out.print("Factorial Value: " + number + "\n" + "Trailing Zero: " + count);
     */

    // For large numbers.
    /*
     * Scanner in = new Scanner(System.in);
     * System.out.print("Input a number: ");
     * int n = in.nextInt();
     * in.close();
     * int n1 = n;
     * long ctr = 0;
     * while (n != 0) {
     * ctr += n / 5;
     * n /= 5;
     * }
     * System.out.printf("Number of trailing zeros of the factorial %d is %d ", n1, ctr);
     */

    // 113.Merge 2 given sorted integer array and create a new sorted array.
    /*
     * int[] number1 = {1, 2, 3, 4}, number2 = {2, 5, 7, 8};
     * int number1Len = number1.length, number2Len = number2.length;
     * 
     * int[] newNumber = new int[number1Len + number2Len];
     * System.arraycopy(number1, 0, newNumber, 0, number1Len);
     * System.arraycopy(number2, 0, newNumber, number1Len, number2Len);
     * Arrays.sort(newNumber);
     * System.out.println(Arrays.toString(newNumber));
     */

    // String newNumbers = Arrays.sort(mergedArrays);
    // 114.Given a string and an offset, rotate string by offset(rotate from left to right).

    /*
     * String word = "Harvent";
     * int offset = 3, length = word.length();
     * int firstCut = length - offset;
     * String endCutString = word.substring(firstCut);
     * word = word.replace(endCutString, "");
     * word = endCutString + word;
     * System.out.println(word);
     */

    /*
     * String str = "abcdef";
     * char[] A = str.toCharArray();
     * int offset = 3;
     * int len = A.length;
     * offset %= len;
     * reverse(A, 0, len - offset - 1);
     * reverse(A, len - offset, len - 1);
     * reverse(A, 0, len - 1);
     * System.out.println("\n" + Arrays.toString(A));
     */

    // 115.Check if a positive number is a palindrome or not.
    /*
     * int number = 1531;
     * String stringNumber = Integer.toString(number);
     * StringBuilder build = new StringBuilder();
     * build.append(number).reverse();
     * 
     * System.out.println(stringNumber.equals(build.toString()));
     */


    // 116.Iterate the integers from 1 to 100. x3 print "Fizz" instead of the number. Print "Buzz" for x5. When number
    // is divided by both 3 and 5, print "fizz buzz".

    /*
     * for (byte i = 1; i <= 100; i++) {
     * if (i % 3 == 0 && i % 5 == 0)
     * System.out.println(i + ": " + "Fizz Buzz");
     * else if(i % 3 == 0)
     * System.out.println(i + ": " + "Fizz");
     * else if(i % 5 == 0)
     * System.out.println(i + ": " + "Buzz");
     * }
     */

    // 117.Compute the square root of given integer.
    /*
     * System.out.print("Input a number: ");
     * Scanner scan = new Scanner(System.in);
     * int number = scan.nextInt();
     * scan.close();
     * 
     * System.out.println((int) Math.sqrt(number));
     */

    // 118.Get the first occurrence(Position starts from 0) of a string with a given string.
    /*
     * String word = "Python", searchedString = "Py";
     * int len = searchedString.length() - 1;
     * int index = word.indexOf(searchedString);
     * 
     * System.out.println(index + len);
     */

    // 119.Get first occurrence(Position starts from 0) of an element in given array.
    /*
     * int[] numbers = {2, 4, 6, 3, 7};
     * 
     * for (byte i = 0; i < numbers.length; i++) {
     * if (numbers[i] == 7) {
     * System.out.println("Position of 7: " + i);
     * break;
     * }
     * 
     * }
     */

    // 120.Search a value in an m x n matrix.
    /*
     * int target = 12, temp = 0;
     * for (int n = 0; n <= target; n++) {
     * System.out.println("");
     * n = temp;
     * if (target == temp)
     * break;
     * for (int m = 1; m < 4; m++) {
     * temp = m + n;
     * System.out.print(m + n);
     * if (target == m + n)
     * break;
     * }
     * }
     */

    // Reference Material (Does not satisfy the question properly.)
    /*
     * int target = 0;
     * int[][] matrix = new int[3][3];
     * for (int row = 0; row < 3; row++)
     * for (int col = 0; col < 3; col++)
     * matrix[row][col] = (1 + row * 3 + col);
     * 
     * for (int row = 0; row < 3; row++) {
     * for (int col = 0; col < 3; col++) {
     * System.out.print(matrix[row][col] + " ");
     * if (col == 2)
     * System.out.println();
     * }
     * }
     * 
     * System.out.println(Boolean.toString(searchMatrix(matrix, target)));
     */

    // 121.Reverse a given Linked List.
    /*
     * Practice list = new Practice();
     * head = new Node(20);
     * head.nextNode = new Node(40);
     * head.nextNode.nextNode = new Node(60);
     * head.nextNode.nextNode.nextNode = new Node(80);
     * 
     * 
     * System.out.println("Original Linked List: ");
     * list.printList(head);
     * head = list.reverse(head);
     * System.out.println("");
     * System.out.println("Reversed Linked List: ");
     * list.printList(head);
     */

    // 122.Find a contiguous subarray with largest sum from given integer array
    /*
     * int[] numbers = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
     * 
     * int max = numbers[0], sum = max, start = 0, end = 0;
     * for (int i = 1; i < numbers.length; i++) {
     * if (numbers[i] > sum + numbers[i]) {
     * sum = numbers[i];
     * start = i;
     * } else {
     * sum = sum + numbers[i];
     * }
     * if(max < sum) {
     * max = sum;
     * end = i;
     * }
     * }
     * 
     * int[] newNumbers = Arrays.copyOfRange(numbers, start, end + 1);
     * 
     * 
     * System.out.println("Range of subarray: " + Arrays.toString(newNumbers));
     * System.out.println("Total value: " + max);
     */

    // 123.Find the subarray with smallest sum from given integer array.
    /*
     * int[] numbers = {-2, 1, -3, 4};
     * 
     * int min = numbers[0], sum = min, start = 0, end = 0;
     * 
     * for(int i = 1; i < numbers.length; i++) {
     * if(numbers[i] < sum + numbers[i]) {
     * sum = numbers[i];
     * start = i;
     * }
     * else
     * sum = sum + numbers[i];
     * 
     * if(min > sum) {
     * min = sum;
     * end = i;
     * }
     * }
     * 
     * int[] newNumbers = Arrays.copyOfRange(numbers, start, end + 1);
     * 
     * System.out.println("Range of subarray: " + Arrays.toString(newNumbers));
     * System.out.println("Total value: " + min);
     */
    // 124.Find the index of a value in a sorted array. If the value does not find return the index where it would be if
    // it were inserted in order
    /*
     * int[] numbers = {1, 2, 4, 5, 7};
     * int target = 6;
     * int result = 0;
     * 
     * if (target == 0)
     * if (numbers[target] != target) {
     * System.out.println("The position of the 0 should be 0");
     * System.exit(0);
     * } else {
     * System.out.print("The position of 0 is 0");
     * System.exit(0);
     * }
     * 
     * for (byte i = 0; i < numbers.length; i++) {
     * if (numbers[i] == target) {
     * System.out.print("The position of " + target + " is " + i);
     * result = 1;
     * System.exit(0);
     * }
     * 
     * if (numbers[i] > target) {
     * result = 2;
     * break;
     * }
     * 
     * }
     * 
     * if (result == 2) {
     * for (byte j = 0; j < numbers.length; j++) {
     * if (numbers[j] > target && target > numbers[j - 1]) {
     * System.out.println("The position of the " + target + " should be " + j);
     * break;
     * }
     * }
     * }
     * else {
     * System.out.println("The position of the " + target + " should be " + numbers.length);
     * }
     */

    // 125.Get the preorder traversal of it's nodes values of a given binary tree.

    /*
     * class PreOrder {
     * int key;
     * PreOrder left, right;
     * 
     * PreOrder(int item) {
     * key = item;
     * left = right = null;
     * }
     * 
     * static final void traverse(PreOrder tree) {
     * if (tree == null)
     * return;
     * 
     * System.out.print(tree.key + " ");
     * traverse(tree.left);
     * traverse(tree.right);
     * }
     * }
     * 
     * PreOrder tree = new PreOrder(10);
     * tree.left = new PreOrder(20);
     * tree.right = new PreOrder(30);
     * tree.left.left = new PreOrder(40);
     * tree.left.right = new PreOrder(50);
     * PreOrder.traverse(tree);
     */

    // 126.Get the Inorder traversal of its nodes' values of a given binary tree.
    /*
     * class InOrder{
     * int key;
     * InOrder left,right;
     * 
     * InOrder(int item){
     * key = item;
     * left = right = null;
     * }
     * 
     * final static void traverse(InOrder tree) {
     * if(tree == null)
     * return;
     * traverse(tree.left);
     * System.out.println(tree.key);
     * 
     * traverse(tree.right);
     * }
     * }
     * 
     * InOrder tree = new InOrder(10);
     * tree.left = new InOrder(20);
     * tree.right = new InOrder(30);
     * tree.left.left = new InOrder(40);
     * tree.left.right = new InOrder(50);
     * InOrder.traverse(tree);
     */


    // 127.Get the Postorder traversal of its nodes' values of a given binary tree.
    /*
     * class PostOrder{
     * int key;
     * PostOrder left,right;
     * 
     * PostOrder(int item){
     * key = item;
     * left = right = null;
     * }
     * 
     * private static final void traverse(PostOrder tree) {
     * if(tree == null)
     * return;
     * 
     * traverse(tree.left);
     * traverse(tree.right);
     * System.out.print(tree.key + " ");
     * }
     * }
     * 
     * PostOrder tree = new PostOrder(55);
     * tree.left = new PostOrder(21);
     * tree.right = new PostOrder(80);
     * tree.left.left = new PostOrder(9);
     * tree.left.right = new PostOrder(29);
     * tree.right.left = new PostOrder(76);
     * tree.right.right = new PostOrder(91);
     * 
     * PostOrder.traverse(tree);
     */

    // 128.Calculate the median of given unsorted integers array.
    /*
     * int[] numbers1 = {10, 2, 38, 22, 38, 23};
     * 
     * MedianSearcher(numbers1);
     * int[] numbers2 = {10, 2, 38, 23, 38, 23, 21};
     * MedianSearcher(numbers2);
     */

    // 129.Find number that appears only once in given integers array, all numbers occur twice.
    /*
     * int[] numbers = {10, 20, 10, 20, 30, 40, 30, 50, 50};
     * 
     * Arrays.sort(numbers);
     * 
     * for (byte i = 1; i < numbers.length; i += 2) {
     * if (numbers[i] != numbers[i - 1]) {
     * System.out.println(numbers[i - 1]);
     * System.exit(0);
     * }
     * }
     * 
     * System.out.println(numbers[numbers.length - 1]);
     */

    // 130.Find the maximum depth of given binary tree.
    /*
     * class Nodes {
     * int key;
     * Nodes left, right;
     * 
     * Nodes(int item) {
     * key = item;
     * left = right = null;
     * }
     * 
     * private final static int traverse(Nodes tree) {
     * if (tree == null)
     * return 0;
     * 
     * int lDepth = traverse(tree.left);
     * int rDepth = traverse(tree.right);
     * 
     * if (lDepth > rDepth)
     * return lDepth + 1;
     * else
     * return rDepth + 1;
     * }
     * }
     * 
     * Nodes tree = new Nodes(55);
     * tree.left = new Nodes(21);
     * tree.right = new Nodes(80);
     * tree.left.left = new Nodes(9);
     * tree.left.right = new Nodes(29);
     * tree.right.left = new Nodes(76);
     * tree.right.right = new Nodes(91);
     * System.out.println(Nodes.traverse(tree));
     */

    // 131.Find the new length of a given sorted array where each element appear only once (remove the duplicates )
    /*
     * int[] numbers = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7};
     * int temp = numbers[0], count = 1;
     * for (byte i = 1; i < numbers.length; i ++) {
     * if(temp != numbers[i])
     * count++;
     * 
     * temp = numbers[i];
     * 
     * }
     * 
     * System.out.println(count);
     */

    // 132.Find the new length of given sorted array where duplicate elements appeared at most twice.
    /*
     * int[] numbers = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
     * int count = 0, temp;
     * boolean canIncrease = false;
     * 
     * for (byte i = 1; i < numbers.length; i++) {
     * 
     * if (numbers[i - 1] == numbers[i]) {
     * count++;
     * canIncrease = true;
     * } else if (canIncrease) {
     * count++;
     * canIncrease = false;
     * }
     * }
     * if (canIncrease)
     * count++;
     * 
     * System.out.println(count);
     */
    // 133.Find path from top left to bottom in right direction which minimizes the sum of all numbers along its path.
    /*
     * int[][] box = {{7, 4, 2}, {0, 5, 6}, {3, 1, 2}};
     * System.out.println(minPath(box));
     */

    // 134.Find the distinct ways you can climb to the top (n steps to reach to the top) of stairs. You can climb 1 or 2
    // steps.
    /*
     * int target = 5;
     * System.out.println(Counter(target));
     */


    // 135.Remove duplicates from a sorted linked list.
    /*
     * LinkedList<Integer> numbers = new LinkedList<Integer>();
     * numbers.add(12);
     * numbers.add(12);
     * numbers.add(14);
     * numbers.add(15);
     * numbers.add(15);
     * numbers.add(16);
     * numbers.add(17);
     * int i = 1;
     * 
     * do {
     * if(numbers.get(i-1) == numbers.get(i)) {
     * numbers.remove(i);
     * }
     * else {
     * i++;
     * }
     * 
     * }while(i < numbers.size());
     * 
     * System.out.println(numbers.toString());
     */

    // 136.Find possible unique paths from top-left corner to bottom-right corner of given grid (m x n).
    /*
     * int m = 3, n = 3;
     * System.out.println(UniquePath(m, n));
     */

    // 137.Find possible unique paths considering some obstacles, from top-left corner to bottom-right corner of given
    // grid (m x n).
    int[][] A = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
    
  }

  //Method for Task 137.
  private static int Path(int[][] A) {
    int r = 3, c = 3;
    
    int[][] paths = new int[r];
  }
  // Method for Task 136.
  /*
   * private static int UniquePath(int m, int n) {
   * int[][] dp = new int[m][n];
   * dp[0][0] = 0;
   * for (int j = 1; j < n; j++) {
   * dp[0][j] = 1;
   * }
   * for (int i = 1; i < m; i++) {
   * dp[i][0] = 1;
   * }
   * 
   * for (int i = 1; i < m; i++) {
   * for (int j = 1; j < n; j++) {
   * dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
   * }
   * }
   * 
   * return dp[m - 1][n - 1];
   * }
   */

  // Method for Task 134.
  /*
   * private static int Counter(int n) {
   * if (n == 1 || n == 0)
   * return 1;
   * else if (n == 2)
   * return 2;
   * 
   * else
   * return Counter(n - 3) + Counter(n - 2) + Counter(n - 1);
   * }
   */



  // Method for Task 133.
  /*
   * private static int minPath(int[][] box) {
   * int N = box.length;
   * int M = box[0].length;
   * 
   * int[][] sum = new int[M][N];
   * 
   * for (byte i = 0; i < M; i++) {
   * for (byte j = 0; j < N; j++) {
   * if (i == 0 && j == 0) {
   * sum[i][j] = box[i][j];
   * continue;
   * }
   * 
   * int up = i == 0 ? Integer.MAX_VALUE : sum[i-1][j];
   * int left = j == 0 ? Integer.MAX_VALUE : sum[i][j-1];
   * 
   * sum[i][j] = Math.min(up, left) + box[i][j];
   * }
   * }
   * return sum[M-1][N-1];
   * }
   */
  // Method for Task 128.

  /*
   * private static final void MedianSearcher(int[] numbers) {
   * int len = numbers.length;
   * int mid = len / 2;
   * if (len % 2 == 0) {
   * int sum = numbers[mid] + numbers[mid - 1];
   * System.out.println(sum / 2);
   * } else {
   * System.out.println(numbers[mid]);
   * }
   * }
   */

  // Method for Task 120.

  /*
   * private static final boolean searchMatrix(int[][] matrix, int target) {
   * if (matrix.length == 0 || matrix[0].length == 0) {
   * return false;
   * }
   * int m = matrix.length, n = matrix[0].length, lower = 0, higher = m * n - 1;
   * 
   * while (lower <= higher) {
   * int mid = (lower + higher) >> 1;
   * int val = matrix[mid / n][mid % n];
   * if (val == target)
   * return true;
   * if (val < target)
   * lower = mid + 1;
   * else
   * higher = mid - 1;
   * }
   * return false;
   * }
   */

  // Method for Task 114.
  /*
   * private static void reverse(char[] str, int start, int end) {
   * while (start < end) {
   * char temp = str[start];
   * str[start] = str[end];
   * str[end] = temp;
   * start++;
   * end--;
   * }
   * }
   */

  // Method for Task 66.
  /*
   * public static boolean is_Prime(int n) {
   * for (int i = 3; i * i <= n; i += 2) {
   * if (n % i == 0) {
   * return false;
   * }
   * }
   * return true;
   * }
   */

  // Method for Task 65.

  /*
   * private static final boolean Checker(int firstNum,int secNum) {
   * if((25 <= firstNum && firstNum <= 75) && (25 <= secNum && secNum <= 75)) {
   * int x = (firstNum % 10);
   * int y = (secNum % 10);
   * firstNum = firstNum/10;
   * secNum = secNum/10;
   * return (firstNum == secNum || x == y || firstNum == y || secNum == x);
   * }
   * else {
   * return false;
   * }
   * }
   */

  // Method for Task 54.
  /*
   * private final static boolean Checker(byte a,byte b, byte c) {
   * byte aDigit = (byte) (a % 10);
   * byte bDigit = (byte) (b % 10);
   * byte cDigit = (byte) (c % 10);
   * 
   * return (aDigit == bDigit || bDigit == cDigit || aDigit == cDigit)
   * }
   */
  /*
   * Method for Task 51.
   * private final static String Trimmer(String input) {
   * StringBuilder stringB = new StringBuilder();
   * int h = input.lastIndexOf(",");
   * int k = h + 2;
   * stringB.append(input);
   * 
   * stringB.delete(h, k);
   * input = stringB.toString();
   * return input;
   * }
   */

  /*
   * Method for Task 19 private static int addBinary(int mixer, int adder) { int output = 0;
   * 
   * if (mixer == adder) { int[] order = new int[20]; byte remainder = 0, i = 0;
   * 
   * while (mixer != 0 || adder != 0) { order[i++] = (mixer % 10 + adder % 10 + remainder) % 2;
   * remainder = (byte) ((mixer % 10 + adder % 10 + remainder) / 2); mixer = mixer / 10; adder = adder
   * / 10; }
   * 
   * if (remainder != 0) { order[i++] = remainder; }
   * 
   * --i;
   * 
   * while (i >= 0) { output = output * 10 + order[i--]; } } else { output = mixer + adder; }
   * 
   * 
   * return output; }
   */

}
