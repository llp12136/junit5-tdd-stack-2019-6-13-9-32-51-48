package com.thoughtworks.tdd;

public class Game {

    public  String fizzBuzz(int i){
        String Fizz="Fizz";
        String Buzz="Buzz";
        String Whizz="Whizz";
        String result= "";
//        if(i %3==0&i %5 == 0&i%7 ==0){
//            result +="FizzBuzzWhizz";
//            return  result;
//        }
//        if(i %3==0&i %7 == 0){
//            result +="FizzWhizz";
//            return  result;
//        }
//        if(i %7==0&i %5 == 0){
//            result +="BuzzWhizz";
//            return  result;
//        }
//        if(i %3==0&i %5 == 0){
//            result +="FizzBuzz";
//            return  result;
//        }
       if(i %3==0){
           result +=Fizz;
          // return  result;
       }
        if(i %5==0){
            result +=Buzz;
            //return  result;
        }
        if(i %7==0){
            result +=Whizz;
           // return  result;
        }
        if(result ==null){
            return  String.valueOf(i);
        }
        return  result;

    }
}
