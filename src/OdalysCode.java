import java.io.InputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.Math;

// Odalys Martinez-Villa
// a program that shows off my skills

public class OdalysCode {

  public static void main(String[] args) {
    System.out.println("Hello, welcome to my program");
    // new scanner
    Scanner KeyboardInput = new Scanner(System.in);
    String Fname = JOptionPane.showInputDialog("What is your first name?");
    String Lname = JOptionPane.showInputDialog("What is your last name?");
    System.out.println("Hello " + Fname + " " +Lname + ", I will tell you how "
            + "many characters there are in your name!");
    nameLen(Fname);
    
    
    System.out.println("Do you want to know what your initials are?");
    System.out.println("Type either y or n");
    String answer;
    // prompts user to enter y or n 
    answer = KeyboardInput.nextLine();
    boolean yn;
    // this will get the first letter of the first name
    String Finitial = Fname.substring(0,1);
    // this will get the first letter of the last name
    String Linitial = Lname.substring(0,1);
    // this will concatnate the 2 first letters of the names
    String initial = Finitial + Linitial;
      OUTER:
      while (true) {
          switch (answer) {
              case "y":
              case "Y":
                  yn = true;
                  //if yes, it will give the initials
                  System.out.println("Your initials are " + initial);
                  break OUTER;
              case "n":
              case "N":
                  yn = false;
                  //if no, it will not find the initials
                  System.out.println("You probably already know your initials.");
                  break OUTER;
              default:
                  //this will prompt user to enter a y or n
                  System.out.println("Sorry, I didn't catch that. Please answer y/n");
                  // this will keep on asking for a y or n if it is not a y or n
                  answer = KeyboardInput.nextLine();
                  break;
          }
      }
      

    System.out.format(" %n Tell me your favorite number and I will tell %n you which is larger, the number entered, or PI"); 
    double favNum = KeyboardInput.nextDouble();
    // output the larger value, favorite number or PI
    System.out.println(Math.max(Math.PI, favNum)+ " is the bigger number");
  }

  private static void nameLen(String name) {

    String nameLen = name;
    int strlen = name.length();

    System.out.format("%n %s are %n %d characters %n in your first name! %n","There", strlen);

  }
      

}

