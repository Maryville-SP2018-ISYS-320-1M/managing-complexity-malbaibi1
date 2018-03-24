/*
   ISYS 320
  	Name(Mansour Albaibi):
  	Date: 3/24/2018  
*/



/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number  | Total Characters  | Back slashes on start | Exlamation marks  | Back slashes on end  | Relation  | 
0                     22                 0                      22                    0                 back/start slashes = line number + line number
1                     22                 2                      18                    2                 back/start slashes = line number + line number
2                     22                 4                      14                    4                 back/start slashes = line number + line number
3                     22                 6                      10                    6                 back/start slashes = line number + line number
4                     22                 8                      6                     8                 back/start slashes = line number + line number
5                     22                 10                     2                     10                back/start slashes = line number + line number

*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 
 A.Make a method drawFigure.
 B.Create an outer loop to control number of lines.
 C.Create a loop inside outer loop to control Back slashes on start of each line.
 D.Create another loop inside outer loop to control Exlamation marks on each line.
 E.Create another loop inside outer loop to control Back slashes on end of each line.
 
 
 
 
 */

public class P2_SlashesAndBangs {

 public static void main(String[] args) {
  drawFigure();
 }
 
 
 public static void drawFigure() {
  int exl=22;
  for( int i = 0; i <= 5; i++ ) {                       //loop to control number of lines
    int mark=i+i;
    for( int j = 1; j <= mark; j++ ) {                  //loop to control Back slashes on start of line
    System.out.print( "/");
    }
    for( int k = 1; k <= exl; k++ ) {                   //loop to control Exlamation marks
    System.out.print( "!");
    }
    for( int j = 1; j <= mark; j++ ) {                 //loop to control Back slashes on end of line
    System.out.print( "/");
    }
    System.out.println();
    exl=exl-4;
    
  }
  
 }

}
