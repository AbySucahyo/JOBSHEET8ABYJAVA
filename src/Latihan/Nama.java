/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Aby
 */
public class Nama {
    public static void huruf1(){
         int x,y;
        
        for(x=1;x<=5;x++){
            
            for(y=1;y<=5;y++){
                if(x==1||x==3||x==5||x==2&&y==1||x==4&&y==5) 
                {
                    System.out.print("@");
                }else 
                    System.out.print(" ");
        }
            System.out.println(" ");
        }
    }
    public static void huruf2(){
           int x,y;
        
        for(x=1;x<=5;x++){
            
            for(y=1;y<=5;y++){
                if(x==5||y==1||y==5){
                System.out.print("%");
            }else
                    System.out.print(" ");
        }
            System.out.println(" ");
    }
    }
    public static void huruf3(){
            int x,y;
        
        for(x=1;x<=5;x++){
        for(y=1;y<=5;y++){
            if(x==1||x==5||y==1){
                System.out.print("&");
    }else System.out.print(" ");
}
        System.out.println(" ");
}
}
    public static void huruf4(){
          int x,y;
        for(x=1;x<=5;x++){
            for(y=1;y<=5;y++){
                if(x==1||x==3||y==1||y==5){
                    System.out.print("#");
            }else System.out.print(" ");
        }
            System.out.println(" ");
    }
    }
    public static void huruf5(){
        int x,y;
        for(x=1;x<=5;x++){
            for(y=1;y<=5;y++){
                if(x==3||y==1||y==5){
                    System.out.print("&");
            }else System.out.print(" ");
        }
            System.out.println(" ");
    }
    }
    public static void huruf6(){
         int x,y;
        
        for(x=1;x<=5;x++){
        for(y=1;y<=5;y++){
            if(x==3||x==5||y==5||y==1&&x<=3){
                System.out.print("%");
            }else System.out.print(" ");
        }    
        System.out.println(" ");
        }
    }
    public static void huruf7(){
        int x,y;
        for(x=1;x<=5;x++){
            for(y=1;y<=5;y++){
                if(x==1||x==5||y==1||y==5){
                    System.out.print("@");
            }else System.out.print(" ");
        }
            System.out.println(" ");
    }
    }
    public static void main(String[] args){
        huruf1();
        System.out.println("\n");
        huruf2();
        System.out.println("\n");
        huruf3();
        System.out.println("\n");
        huruf4();
        System.out.println("\n");
        huruf5();
        System.out.println("\n");
        huruf6();
        System.out.println("\n");
        huruf7();
        System.out.println("\n");
        
        
    }
    }

