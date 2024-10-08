public class Money {
    private long dollars;
    private long cents;

    // Constructor that accepts a double amount
    public Money(double amount) {
        dollars = (long) amount;
        cents = (long) ((amount - dollars) * 100);
    }

    // Copy constructor
    public Money(Money other) {
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    // Add method
    public Money add(Money otherAmount) {
        long totalCents = this.cents + otherAmount.cents;
        long newDollars = this.dollars + otherAmount.dollars + (this.totalCents / 100);
        long newCents = this.totalCents % 100;
        return new Money(newDollars + newCents / 100.0);
    }

    // Subtract method
    public Money subtract(Money otherAmount) {
        long totalCents1 = this.dollars * 100 + this.cents;
        long totalCents2 = otherAmount.dollars * 100 + otherAmount.cents;
        long difference = this.totalCents1 - this.totalCents2;
        return new Money(difference / 100.0);
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

    // Equals method
    public boolean equals(Money other) {
        return this.dollars == other.dollars && this.cents == other.cents;
    }

    // toString method
    public String toString() {
        return "$" + dollars + "." + (cents < 10 ? "0" : "") + cents;
    }
}