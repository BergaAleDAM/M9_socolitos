
//
//import javax.swing.*;
//
//public class main {
///**
// * @param args
// */
//
//  public static void main(String[] args) {
//
//    String myOptions="S = Select Transaction\n"+
//    "Q = Quit\n"+"Enter your choice";
//
//    String myPin="Enter your PIN";
//    String Y = "Yes";
//    String N = "No";
//
//    String value = null; // CHANGES START HERE
//    boolean access = false;
//    while (!access){
//         value=JOptionPane.showInputDialog(null,myOptions,"Computerized Automatic Teller Machine",1);
//
//          if (value.equals("S") ){
//                String pin = JOptionPane.showInputDialog(null, myPin, "Computerized Automatic Teller Machine", 1);
//                if (pin.equals("correctpin")){ // <<------ Here you do correct checks for pin
//                    access = true;
//                    continue;
//                } // if pin
//          }// if value
//
//          else if(value.equals("Q") ){
//              JOptionPane.showMessageDialog(null, "Are you sure you want to exit?","Computerized Automatic Teller Machine", 1);
//          }// elseif vale
//
//          else{
//              JOptionPane.showMessageDialog(null, "Please the correct letter!","Computerized Automatic Teller Machine", 1);
//              continue; //<--- !S and !Q send to the top of the loop
//          }// else
//      }// while access
//    } // main
//}//end of class