package _07_sleepy_head;
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
        //isWeekday = JOptionPane.showConfirmDialog(null, "Is it a weekday?", JOptionPane.YES_NO_OPTION);
        int a = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        //JOptionPane.showMessageDialog(null, a);
        if(a==0){
        	isWeekday=true;
        	}else if(a==1){
        	isWeekday=false;
        	}else{
        		JOptionPane.showMessageDialog(null, "?");
        	}
        
        int b = JOptionPane.showConfirmDialog(null, "Are you on vacation?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
        //JOptionPane.showMessageDialog(null, b);
        if(b==0){
        	isVacation=true;
        }else if(b==1){
        	isVacation=false;
        }else{
        	JOptionPane.showMessageDialog(null, "?");
        }
        if(a==1 || b==0){
        JOptionPane.showMessageDialog(null, "Sleep in.");
        }else if(a==0&&b==1){
        	JOptionPane.showMessageDialog(null, "Get up.");
        }else{
        	JOptionPane.showMessageDialog(null, "?");
        }
        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }
}
