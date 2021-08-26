package com.houzw.util;

public class Hello {
    public static void main(String[] args) {
        for(int i=0; i<8; i++){
            new Thread(() ->{
                while (true){
                    int x = 12*24;
                }
            }).start();
        }
/*        String str="Sucessfully tagged cop-app:1.0.0";
        if(str.contains("Sucessfully")){
            System.out.println("sucess");
        }else{
            System.out.println("failed");
        }*/
    }
}


