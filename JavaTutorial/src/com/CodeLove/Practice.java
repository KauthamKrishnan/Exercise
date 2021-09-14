// Java Basic Exercise(https://www.w3resource.com/java-exercises/basic/index.php)

package com.CodeLove;

import java.io.Console;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
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
    /*int[] number1 = {1, 2, 3};
    int[] number2 = {number1[number1.length - 1], number1[1], number1[0]};
    System.out.println(Arrays.toString(number2));*/
    
    //82.
    
    //83.
    
  }

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


