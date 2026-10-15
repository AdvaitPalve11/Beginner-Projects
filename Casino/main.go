package main

import (
	"fmt"
)

func getName() {

	name := ""

	fmt.Println("Welcome to Casino")
	fmt.Printf("Enter Your name: ")

	_, err := fmt.Scanln(&name)

	if err != nil {
		return
	}

	fmt.Printf("welcome %s, Let's play\n", name)

}

func getBet(balance uint) uint { // using uint as money is +ve

	if balance <= 0 {
		fmt.Printf("Your Balance is Zero")
	}

	var bet uint

	for true {
		fmt.Printf("Enter Your bet amount, OR 0 to Quit ")
		fmt.Scan(&bet)

		if(bet == 0){
			break
		}

		if bet > balance {
			fmt.Printf("Your Bet %d is Greater than your Current Balance %d ", bet, balance)
		} else {
			break
		}

	}
	return bet
}

func currBalance(){

}

func main() {

	var balance uint = 200
	getName()
	

	for balance > 0 {
		var bet uint = getBet(balance)
		balance -= bet
	}

	

}
