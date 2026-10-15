#include <iostream>
#include "randNumGen.h"
#include <utility>

void compare(int guess , int& genNum);

int main(){

    //random number
    Random rnum;
    
    //set range
    rnum.setRange(1,100);
    //get range
    std::pair<int,int> p;
    p = rnum.getRange();
    
    //generate random num
    int genNum = rnum.generator();

    int guess = 0; 
        
    while(guess != genNum){
        std::cout<<"Enter Your Guess: ";
        std::cin>>guess;
        compare(guess,genNum);
    }
    return 0;
}

void compare(int guess , int& genNum){
    if (guess == genNum){
        std::cout<<"Congrats you guessed the Correct Number ";
        exit(0);
    }

    else if (guess < genNum)
        std::cout<<"Guessed Number is Smaller\n Guess AGAIN : ";

    else
        std::cout<<"Guessed Number is Larger\n Guess AGAIN : ";

}