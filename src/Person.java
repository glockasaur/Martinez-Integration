import java.util.Scanner;

class Person {
  protected String firstName;
  protected String lastName;
  protected int idNumber;

  // Constructor
  Person(String firstName, String lastName, int identification) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = identification;
  }

  // Print person data
  public void printPerson() {
    System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
  }

}


class Student extends Person {
  private int[] testScores;

  /*
   * Class Constructor
   * 
   * @param firstName - A string denoting the Person's first name.
   * 
   * @param lastName - A string denoting the Person's last name.
   * 
   * @param id - An integer denoting the Person's ID number.
   * 
   * @param scores - An array of integers denoting the Person's test scores.
   */
  // Write your constructor here

  /*
   * Method Name: calculate
   * 
   * @return A character denoting the grade.
   */
  // Write your method here
  private int[] testscores;

  Student(String firstName, String lastName, int id, int[] testScores) {
    super(firstName, lastName, id);
    testscores = new int[testScores.length];
    for (int i = 0; i < testScores.length; i++) {
      testscores[i] = testScores[i];
    }
  }

  char calculate() {
    int avg = 0;
    for (int i = 0; i < testscores.length; i++) {
      avg += testscores[i];
    }
    avg = avg / testscores.length;
    return (avg > 89 ? 'O'
        : avg > 79 ? 'E' : avg > 69 ? 'A' : avg > 54 ? 'P' : avg > 39 ? 'D' : 'T');
  }
}


class Solution {
  public static void main(String[] args) {
    String firstName;
    String lastName;
    int id;
    int[] testScores;
    try (Scanner scan = new Scanner(System.in)) {
      firstName = scan.next();
      lastName = scan.next();
      id = scan.nextInt();
      int numScores = scan.nextInt();
      testScores = new int[numScores];
      for (int i = 0; i < numScores; i++) {
        testScores[i] = scan.nextInt();
      }
    }

    Student s = new Student(firstName, lastName, id, testScores);
    s.printPerson();
    System.out.println("Grade: " + s.calculate());
  }
}
