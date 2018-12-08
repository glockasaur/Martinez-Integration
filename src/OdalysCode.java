import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;



// Odalys Martinez-Villa
// a program that shows off my skills

public class OdalysCode {

    /**
     *
     * @param args this is the main method. This is where all the variables are.
     */
    public static void main(String[] args) {
    System.out.println("Hello, welcome to my program");
    // new scanner
    String fname = JOptionPane.showInputDialog("What is your first name?");
    String lname = JOptionPane.showInputDialog("What is your last name?");
    System.out.println("Hello " + fname + " " + lname + ", I will tell you how "
        + "many characters there are in your name!");
    nameLen(fname); // this will find the amount of characters in your first name
    initials(fname, lname); // this will find your initials

    Scanner keyboardinput = new Scanner(System.in);
    System.out.format(
        " %n Tell me your favorite number and I will tell %n you which is larger, the number"
        + " entered, or PI");
    double favNum = keyboardinput.nextDouble();
    // output the larger value, favorite number or PI
    System.out.println(Math.max(Math.PI, favNum) + " is the bigger number");

    System.out.println(
        "Enter a number to make simple array sum, where your number will be added to itself "
        + "5 times");
    // output will be input added to itself 5 times
    int arItem = keyboardinput.nextInt();
    // try block
    try {
      simpleArraySum(arItem);
    } catch (IOException e) {
      // catch block
      e.printStackTrace();
    }

    System.out.println("We can also make a sum using a while loop!");
    System.out.println("Enter a number less than 50 to make a sum");
    int count = keyboardinput.nextInt(); // initial number
    simpleWhileLoop(count); // output will be input added by one until 50

    System.out.println("We can also make a sum using a do-while loop that will count from 1!");
    System.out.println("Enter a number you want to count to");
    int countTo = keyboardinput.nextInt(); // input of number
    simpleDoWhileLoop(countTo); // output will be a count up intil input number

    System.out.println("Let's make a staircase. How long do you want it? Enter a number");
    int width;
    width = keyboardinput.nextInt(); // width of staircase
    staircase(width); // output will be a staircase of #

    Bird bird = new Bird(); // character.java file
    bird.walk(); // output
    bird.fly();
    bird.sing();

    System.out.println("Let's make another array list to locate specific numbers at a place.");
    System.out.println("Enter the number of columns there are in your array");
    System.out.println("Enter your list of numbers with spaces in between");

    // The first line has an integer n
    // In each of the next n lines there will be an integer d denoting number of integers on that
    // line
    // and then there will be d space-separated integers.
    // In the next line there will be an integer q denoting number of queries.
    // Each query will consist of two integers x and y.
    List<List<Integer>> lines = new ArrayList<List<Integer>>();
    int n = keyboardinput.nextInt();
    for (int i = 0; i < n; i++) {
      List<Integer> line = new ArrayList<Integer>();
      int d = keyboardinput.nextInt();
      for (int j = 0; j < d; j++) {
        line.add(keyboardinput.nextInt());
      }
      lines.add(line);
    }
    System.out.println("Enter the number of rows there are in your array");
    System.out.println("Enter x,y values to find the specific number in the array");
    int q = keyboardinput.nextInt();
    for (int i = 0; i < q; i++) {
      int x = keyboardinput.nextInt();
      int y = keyboardinput.nextInt();
      if (y > lines.get(x - 1).size()) {
        System.out.println("ERROR!");
      } else {
        System.out.println(lines.get(x - 1).get(y - 1));
      }
    }
    keyboardinput.close();
  }


  private static void nameLen(String fname) {
    int strlen = fname.length();
    System.out.format("%n %s are %n %d characters %n in your first name! %n", "There", strlen);

  }

    /**
     *
     * @param fname this variable is the first name.
     * @param lname this variable is the last name.
     */
    public static void initials(String fname, String lname) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Do you want to know what your initials are?");
    System.out.println("Type either y or n");
    String answer;
    // prompts user to enter y or n
    answer = keyboard.nextLine();
    boolean yn;
    // this will get the first letter of the first name
    String finital = fname.substring(0, 1);
    // this will get the first letter of the last name
    String linitial = lname.substring(0, 1);
    // this will concatnate the 2 first letters of the names
    String initial = finital + linitial;
    OUTER: while (true) {
      switch (answer) {
        case "y":
        case "Y":
          yn = true;
          // if yes, it will give the initials
          System.out.println("Your initials are " + initial);
          break OUTER;
        case "n":
        case "N":
          yn = false;
          // if no, it will not find the initials
          System.out.println("You probably already know your initials.");
          break OUTER;
        default:
          // this will prompt user to enter a y or n
          System.out.println("Sorry, I didn't catch that. Please answer y/n");
          // this will keep on asking for a y or n if it is not a y or n
          answer = keyboard.nextLine();
          break;
      }
    }
    keyboard.close();
  }

  /**
   * @param arItem the number entered for the array.
   * @return it returns the sum of the array.
   * @throws IOException finds an exception of the method.
   */
  public static int simpleArraySum(int arItem) throws IOException {
    // enter an int and it will be added itself 5 times
    int[] ar = new int[5];
    int sum = 0;

    for (int arItr = 0; arItr < ar.length; arItr++) {

      ar[arItr] = arItem;
      sum = sum + ar[arItr];
      System.out.println(sum);

    }
    return sum; // prints 5 lines, each will be input added itself by 5 times
  }


  /** simple while loop.
   * @param count this is my int variable.
   * @return this returns the count.
   */
  public static int simpleWhileLoop(int count) {
    // while loop
    while (count < 50) { // input number will be added by 1 intil 50
      System.out.println("Count is: " + count);
      count++;

    }
    return count;
  }

    /**
     *
     * @param countTo this variable indicates what number to count to.
     * @return returns the count from 1 to countTo number.
     */
    public static int simpleDoWhileLoop(int countTo) {

    // do-while loop
    int initial = 1;
    do {
      System.out.println("Count is: " + initial);
      initial++;
    } while (initial <= countTo);
    return initial; // returns the count from 1 to wished number
  }

  /**
   * @param width the number entered for wished width of staircase
   * @return it staircase
   */
  private static int staircase(int width) {
    // creates a staircase of #

    for (int i = 0; i < width; i++) {
      for (int j = 0; j < width; j++) {
        if (j < width - 1 - i) {
          System.out.print(" ");
        } else {
          System.out.print("#");
        }
      }
      System.out.println();
    }
    return width;
  }



}
