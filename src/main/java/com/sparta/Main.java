package com.sparta;

public class Main {
    public static void main(String[] args) {
        int timeOfday = 21;
        String result= greeting(timeOfday);
        System.out.println(result);
    }

    public static String greeting(int timeOfday) {
        String greeting;
        if(timeOfday >=5 && timeOfday <12 ){
            greeting = "good morning";
        }
        else if(timeOfday >=12 && timeOfday <=18){
            greeting = "good afternoon";
        }
        else{
            greeting = "good evening ";
        }
        return greeting;
    }
}