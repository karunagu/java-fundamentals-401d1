import java.util.Random;
import java.time.*;

public class Main {
  public static void main(String[] args) {
    String greeting = "Welcome to my Java program.";
    System.out.println(greeting);

    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    // flipNHeads(5);
    // clock();

  }



  // // This function has a return type of "int"
  // public static int multiplyByTwo(int n) {
  //   return n * 2;
  // }

public static String pluralize(String pet,int cnt) {
if (cnt == 1) {
    return pet;
}
else {
  return pet+"s";
}
}


public static void flipNHeads(int cnt) {
int totCount = 0;
int totalFlips = 0;
double randomDouble = 0.0;
char prevFlip = ' ';
System.out.println("Random :" + randomDouble);
// Random random = new Random();
while (totCount < cnt) {
  if (prevFlip != 'h') {
    // System.out.println("prevFlip"+prevFlip);
    totCount=0;
  }
  // System.out.println("totCount :" + totCount);
  randomDouble = Math.random();
  totalFlips++;
  // System.out.println("Random :" + randomDouble);
  if (randomDouble >= 0.5) {
    System.out.println("heads");
    prevFlip = 'h';
    totCount++;
  }
  else {
    System.out.println("tails");
    prevFlip = 't';
  }
  
}
  System.out.println("It took "+totalFlips + " flips to flip " + cnt + " head in a row");

}

public static void clock() {
  int hour = 0;
  int minute = 0;
  int second = 0;
  int prevSecond = 0;
  String dispHour = " ";
  String dispMinute = " ";
  String dispSecond = " ";

  while (true) {
    LocalDateTime now = LocalDateTime.now();
    hour = now.getHour();
    minute = now.getMinute();
    second = now.getSecond();
    if (prevSecond != second) {
            if (hour < 10) {
        dispHour = ("0" + String.valueOf(hour));
      }
      else {
        dispHour = String.valueOf(hour);
      }
      if (minute < 10) {
        dispMinute = ("0" + String.valueOf(minute));
      }
      else {
        dispMinute = String.valueOf(minute);
      }
      if (second < 10) {
        dispSecond = ("0" + String.valueOf(second));
      }
      else {
        dispSecond = String.valueOf(second);
      }
      System.out.println("Current Local Time => " + dispHour + ":" + dispMinute + ":" + dispSecond);
      prevSecond = second;
  }
  }

}

}