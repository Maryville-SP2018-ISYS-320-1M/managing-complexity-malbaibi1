

/*
 ISYS 320
  	Name(Mansour Albaibi):
  	Date: 3/24/2018
*/

public class BoxWindow {

 public static void main(String[] args) { 
  drawBoxCap();
  drawBoxInsides();
  drawBoxCap();
  drawBoxInsides();
  drawBoxCap();
 }
 
 public static void drawBoxCap() {
  int width=5;                                                             //variable for width
  System.out.print("+");
  
  for( int capDashIndex = 1; capDashIndex <= width - 2; capDashIndex++ ) {
   System.out.print("=");
  }
  
  System.out.print("+");
  
    for( int capDashIndex = 1; capDashIndex <= width - 2; capDashIndex++ ) {
   System.out.print("=");
  }
  
  System.out.println("+");  
 }
 
 public static void drawBoxInsides() {
  int height=5;                                                            //variable for height
  for( int insideRowIndex = 1; insideRowIndex <= height - 2; insideRowIndex++ ) {
   drawBoxInsideLine();
  }
 }
 
 public static void drawBoxInsideLine() {
  int width=5;                                                              //variable for width
  System.out.print("|");
  
  for( int insideRowIndex = 1; insideRowIndex <= width - 2; insideRowIndex++ ) {
   System.out.print(" ");
  }
  
  System.out.print("|");
  
  for( int insideRowIndex = 1; insideRowIndex <= width - 2; insideRowIndex++ ) {
   System.out.print(" ");
  }
  
  System.out.println("|");
 }

}
