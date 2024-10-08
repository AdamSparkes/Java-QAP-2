public class Money {
    private long dollars;
    private long cents;

    // Constructor accepting double
    public Money(double amount) {
        long totalCents = Math.round(amount * 100); // Convert the amount to cents
        this.dollars = totalCents / 100; // Calculate dollars
        this.cents = totalCents % 100; // Calculate cents
    }

    // Overloaded constructor accepting dollars and cents
    public Money(long dollars, long cents) {
        if (cents < 0 || cents >= 100) {
            throw new IllegalArgumentException("Cents must be between 0 and 99.");
        }
        this.dollars = dollars;
        this.cents = cents;
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Add method
    public Money add(Money otherAmount) {
        long totalCents = this.cents + otherAmount.cents; 
        long newDollars = this.dollars + otherAmount.dollars + (totalCents / 100);  
        long newCents = totalCents % 100;

        return new Money(newDollars, newCents);
    }


    // Subtract method
    public Money subtract(Money otherAmount) {
        long totalCents1 = this.dollars * 100 + this.cents;  
        long totalCents2 = otherAmount.dollars * 100 + otherAmount.cents;  
        long difference = totalCents1 - totalCents2;

        if (difference < 0) {
            throw new IllegalArgumentException("Resulting money cannot be negative.");
        }

        return new Money(difference / 100, difference % 100);
    }

    // CompareTo method
    public int compareTo(Money other) {
        if (this.dollars > other.dollars || (this.dollars == other.dollars && this.cents > other.cents)) {
            return 1;  
        } else if (this.dollars == other.dollars && this.cents == other.cents) {
            return 0; 
        } else {
            return -1;  
        }
    }
    public boolean equals(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    // toString method
    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" : "") + cents;
    }
}