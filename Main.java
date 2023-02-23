import java.lang.reflect.Array;

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
  public static int[][] copyRectangle(int[][] str){
    Array[][] copy= new Array[str.length][str[0].length];
    
    for(int row=0;row<str.length;row++){
      for (int value=0;value<str[0].length;value++) {
        copy[row][value] = str[row][value];
    }
    
    }
    return copy;
  }

//Good?
  public static String copyRagged(int[][] str){
    String copy = "";
    for(int[] row : str){
      for (int value : row) {
        copy += +value+" ";
    }
    copy= copy+System.lineSeparator();
    }
    return copy;
  }
  


//fix this
  public static Array[][] printTranspose(double[][] str){
    Array[][] copy= new Array[str.length][str[0].length];
    
    for(int tall=0;tall<str[0].length;tall++){
      for (int value=0;value<str.length;value++) {
        //copy[tall][value] = str[tall][value];
      }
    }
    return copy;
  }


  public static void main(String[] args) {
    int[][] list1 = new int[][] {
      {39,69,90},
      {30,60,76,60},
      {55,96,85}
    };
    int[][] list = new int[][] {
      {39,69,90},
      {30,60,76},
      {55,96,85}
    };

    double[][] doublelist = new double[][] {
    {99, 85, 98},
    {98, 57, 79},
    {92, 77, 74},
    {94, 62, 81},
    {99, 94, 92},
    {80, 76.5, 67},
    {76, 58.5, 90.5},
    {92, 66, 91},
    {77, 70.5, 66.5},
    {89, 89.5, 81}
    };
    int num = doublelist.length;
    int num2 = doublelist[0].length;
    System.out.println(printTranspose(doublelist));
    //System.out.println(list[1][2]);
    
    //System.out.println(copySquare(list));
    
    //System.out.println(copyRectangle(list));

   
  }
}

//javac Main.java; java Main