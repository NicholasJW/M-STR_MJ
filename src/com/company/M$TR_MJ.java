// This is the majiang program written in MSTR HQ 1030 by NicholasJW

package com.company;
//import javax.swing.*;


import java.util.Scanner;

public class M$TR_MJ {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to M$TR MJ.");

        String ans;
        System.out.println("Enter your user name: ");
        String name = sc.nextLine();
        do{

            System.out.println("\nEnter \"s\" to creat a Majiang table or enter \"c\" to join an existing table. Enter \"q\" to quit.");
            ans = sc.nextLine();

            if(ans.charAt(0) == 's'){
                Server server = new Server(name);
                return;
            }else if(ans.charAt(0) == 'c'){
                Client client = new Client(name);
                return;
            }else if(ans.charAt(0) == 'q'){
                return;
            }
        }while(true);

    }
}
