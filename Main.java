import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String [] rosterOne = new String[10];

  Scanner input = new Scanner(System.in);
  String[] BarrysRoster = new String[10];

  for (int i = 0; i < rosterOne.length; i++)
  {
    rosterOne[i] = input.next();
  }
    String [] rosterTwo = new String[12];
    for (int index = 0; index < rosterOne.length; index++)
  {
    rosterOne[index] = rosterTwo[index];
    System.out.println(rosterOne[index]);
  }
  System.out.println(rosterTwo + "Zane" + "Walter");
  }
}