import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Main { 
                      //fix this again
                      public static Array[][] copySquare(int[][] str){
                      Array[][] copy= new Array[str.length][str.length];
                      
                      for(int row=0;row<str.length;row++){
                      for (int value=0;value<str.length;value++) {
                      copy[row][value] = str[row][value];
                      }
                      
                      }
                      return copy;
                      }
                      //code needs to be changed and changed
                      public static Array[][] copyRectangle(int[][] str){
                      Array[][] copy= new Array[str.length][str[0].length];
                      
                      for(int row=0;row<str.length;row++){
                      for (int value=0;value<str[0].length;value++) {
                      copy[row][value] = str[row][value];
                      }
                      
                      }
                      return copy;
                      }
                     
  // Good?
  public static String copyRagged(int[][] str) {
    String copy = "";
    for (int[] row : str) {
      for (int value : row) {
        copy += +value + " ";
      }
      copy = copy + System.lineSeparator();
    }
    return copy;
  }

  // Done
  public static void printTranspose(double[][] str) {
    double[][] copy = new double[str.length][str[0].length];

    for (int tall = 0; tall < str[0].length; tall++) {
      for (int value = 0; value < str.length; value++) {
        copy[value][tall] = str[value][tall];

      }
    }
    String text = "";
    for (int tall = 0; tall < str[0].length; tall++) {
      for (int value = 0; value < str.length; value++) {
        text += copy[value][tall] + " ";

      }
      System.out.println(text);
      text = "";
    }

  }

  // nice
  public static void withWeightedAverage(double[][] gradeList, double[] weight) {
    double[][] longlist = new double[gradeList.length+1][weight.length + 1];
    double answer = 0;
    double total = 0;
    double num = 0;
    

    int upndown = 0;
    int sidebyside = 0;
    for (double[] row : gradeList) {
      total = 0;
      for (double value : row) {
        longlist[upndown][sidebyside] = value;
        num = value * weight[sidebyside];
        total += num;
        sidebyside++;
      }
      answer = (total / weight.length);
      longlist[upndown][sidebyside] = answer;
      upndown++;
      // sidebyside++;
      sidebyside = 0;

    }
    upndown =0;
    for(int loop=0;loop<weight.length;loop++){
      for (double[] row : gradeList) {
        total+=row[loop];
      }
      answer = (total/(gradeList.length));
      longlist[longlist.length-1][loop]=answer;
    }
    System.out.println(Arrays.deepToString(longlist));
  }

  public static void main(String[] args) {
    int[][] list1 = new int[][] {
        { 39, 69, 90 },
        { 30, 60, 76, 60 },
        { 55, 96, 85 }
    };
    int[][] list = new int[][] {
        { 39, 69, 90 },
        { 30, 60, 76 },
        { 55, 96, 85 }
    };
    double[] weight = new double[] { .25, 0.25, .50 };

    double[][] doublelist = new double[][] {
        { 99, 85, 98 },
        { 98, 57, 79 },
        { 92, 77, 74 },
        { 94, 62, 81 },
        { 99, 94, 92 },
        { 80, 76.5, 67 },
        { 76, 58.5, 90.5 },
        { 92, 66, 91 },
        { 77, 70.5, 66.5 },
        { 89, 89.5, 81 }
    };
    int num = doublelist.length + 1;
    int num2 = doublelist[0].length + 1;
    // System.out.println(num+" "+num2);
    // printTranspose(doublelist);

    withWeightedAverage(doublelist, weight);

    // System.out.println(list[1][2]);

    // System.out.println(copySquare(list));

    // System.out.println(copyRectangle(list));

  }
}

// javac Main.java; java Main