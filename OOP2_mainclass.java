
package OOP2_CW3;
import java.util.Scanner;
import java.util.ArrayList;

   public class OOP2_mainclass{
       
       
       public static void main(String[] args){
           
           for (int y = 1; y<5; y++){
               System.out.println("Student Name: ");
              
              OOP2_CW3 std = new OOP2_CW3();
              std.setName(new java.util.Scanner(System.in).nextLine());
              OOP2_CW3 stds = new OOP2_CW3(98);
              
              System.out.println("Student Reg Number: ");
              
              OOP2_CW3 std1 = new OOP2_CW3();
              std.setRegNo(new java.util.Scanner(System.in).nextLine());
              
              System.out.println("Year Of Birth: ");
              
              OOP2_CW3 std2 = new OOP2_CW3();
              std.setYob(new java.util.Scanner(System.in).nextInt());
          
              
              Scanner Smarks = new Scanner(System.in);
           
               
           
          
           String courses[] = {"oop2", "Computer", "Programming", "Research", "E-Commerce", "Information System", "Numerical"};
           ArrayList<Integer> allMarks = new ArrayList<Integer>();
           
           int studentsmarks;
           for (int x=0; x<6; x++){
                System.out.print(courses[x] + ":");
               studentsmarks = Smarks.nextInt();
               stds.setMarks(studentsmarks);
               allMarks.add(x,studentsmarks);
              
           }
           int total = 0;
           for (int A = 0; A < allMarks.size(); A++){
               total += allMarks.get(A);
               
               int aver = total / 6;
               System.out.println("Total marks: " + total);
                System.out.println("Average marks: " + aver);
               
           }
             allMarks.clear();
           }
          
           
         
       }
   }
