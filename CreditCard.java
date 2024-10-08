public class CreditCard{
private Money balance;
private Money creditLimit;
private Person owner; 

//Constructor
public CreditCard(Person cardHolder, Money limit){
    this.owner = cardHolder;
    this.creditLimit = new Money(limit); //using the Copy constructor from Money.java
    this.balance = new Money(0); //Initializing the balance as 0.
}
//getters

public Money getBalance(){
    return new Money(this.balance);
}
public Money getCreditLimit(){
    return new Money(creditLimit);  
}
//accessor method for availible credit
public Money getAvailableCredit() {
    Money availableCredit = creditLimit.subtract(balance);
    return new Money(availableCredit);
}
//accessor method to aquire the details of the owner using the toString method from Person.java
public String getPersonals(){
   return owner.toString(); 
}
//method to charge, ensuring to not go over the credit limit, if so then prints an error.
public void charge(Money amount) {
    Money newBalance = balance.add(amount);
    if (newBalance.compareTo(creditLimit) <= 0) {
        balance = newBalance;
    } else {
        System.out.println("Charge denied: Over the credit limit.");
    }
}
//a simple method updated the balance with the payment amount.
public void payment(Money amount){
    balance = balance.subtract(amount);
}

}