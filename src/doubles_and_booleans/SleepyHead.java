package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /* You MUST use the above boolean variables in your code */
        
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */


        int weekday =JOptionPane.showConfirmDialog(null, "Is it a weekday" , "Sleepy Head", JOptionPane.YES_NO_OPTION);
        int vacation = JOptionPane.showConfirmDialog(null, "Is it vacation" , "Sleepy Head", JOptionPane.YES_NO_OPTION);
        System.out.println(weekday); 
        if( vacation==0||weekday==0) {
        	
        	JOptionPane.showMessageDialog(null, "Sleep in");
        }
    	JOptionPane.showMessageDialog(null, "Get up sleepy head");
 if(vacation==1) {
	System.out.println(vacation);
	if(vacation==1) {
	JOptionPane.showMessageDialog(null, "Sleep in");
	int weekend =JOptionPane.showConfirmDialog(null, "Is it the weekend" , "Sleepy Head" ,JOptionPane.YES_NO_OPTION);
       if(weekend==1){
    	   JOptionPane.showMessageDialog(null, "Sleep in");
       }
}
}
    }
}



 
 
 
 
 //JOptionPane.showConfirmDialog(null, "Are you on vacation", )  
     
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    

